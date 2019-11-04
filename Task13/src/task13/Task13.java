/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task13;

/**
 *
 * @author DOLPHIN
 */
public class Task13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock firstClock = new Clock(0);
        for (int i = 1; i <= 10; i++) {
            firstClock.tick();
            System.out.println(firstClock.toString());
        }
        Clock secondClock = new Clock(1, 1, 10);
        for (int i = 1; i <= 10; i++) {
            secondClock.tick();
            System.out.println(secondClock.toString());
        }
        firstClock.addClock(secondClock);
        System.out.println(firstClock.toString());
        System.out.println(secondClock.toString());
        Clock thirdClock = new Clock();
        thirdClock.subtractClock(secondClock);
        // System.out.println(thirdClock.toString());   didn't said to print this line if  want then print this line for thirdClock.
    }

}
