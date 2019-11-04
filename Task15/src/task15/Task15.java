/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task15;

/**
 *
 * @author 19301261
 */
public class Task15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BoroInt b = new BoroInt("19301261");
        System.out.println(b.toString());
        System.out.println(b.trim("      19301261"));
        System.out.println(b.validValue("01317090979"));
       BoroInt bi= new BoroInt(12);
       bi=bi.add(b);
        System.out.println(bi.toString());
       BoroInt b1 = new BoroInt(19301261);
        System.out.println(b1.toString());
        BoroInt b2= new BoroInt("01534741641");
        System.out.println(b2.toString());
        System.out.println(b.toString());
    }

}
