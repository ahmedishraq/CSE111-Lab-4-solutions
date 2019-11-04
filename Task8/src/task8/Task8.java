/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task8;

/**
 *
 * @author DOLPHIN
 */
public class Task8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student john = new Student();
        john.setName("Ishraq");
        john.setAddress("Shyamoli");
        john.setID("19301261");
        john.setCgpa(3.28);
        john.getName();
        john.getAddress();
        john.getID();
        john.getCgpa();
        System.out.println(john.getName());
        System.out.println(john.getAddress());
        System.out.println(john.getID());
        System.out.println(john.getCgpa());
        System.out.println("");
        Student mike = new Student();
        mike.setName("Ahmed");
        mike.setAddress("Dhanmondi");
        mike.setID("19301262");
        mike.setCgpa(3.5);
        mike.getName();
        mike.getAddress();
        mike.getID();
        mike.getCgpa();
        System.out.println(mike.getName());
        System.out.println(mike.getAddress());
        System.out.println(mike.getID());
        System.out.println(mike.getCgpa());
        System.out.println("");
        Student carol = new Student();
        carol.setName("Esha");
        carol.setAddress("Mohammadpur");
        carol.setID("19301263");
        carol.setCgpa(4.00);
        carol.getName();
        carol.getAddress();
        carol.getID();
        carol.getCgpa();
        System.out.println(carol.getName());
        System.out.println(carol.getAddress());
        System.out.println(carol.getID());
        System.out.println(carol.getCgpa());
        System.out.println("");
    }

}
