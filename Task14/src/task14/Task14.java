/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task14;

/**
 *
 * @author DOLPHIN
 */
public class Task14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complex c1 = new Complex(10.0, 20.0);
        Complex c2 = new Complex(30.0, 40.0);
        Complex c3 = new Complex();
        c3 = c3.add(c1, c2);
        System.out.println(c3.toString());
        Complex c4 = new Complex();
        c4 = c4.subtract(c2, c1);
        System.out.println(c4.toString());
        Complex c5 = new Complex();
        c5 = c5.multiply(c1, c2);
        System.out.println(c5.toString());
        Complex c6 = new Complex();
        c6 = c6.divide(c2, c1);
        System.out.println(c6.toString());
    }

}
