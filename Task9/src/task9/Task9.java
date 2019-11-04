/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

/**
 *
 * @author DOLPHIN
 */
public class Task9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setName("Ishraq");
        acc1.setAddress("Shyamoli");
        acc1.setAccountID("19301261");
        acc1.setBalance(2000);
          acc1.getName();
        acc1.getAddress();
        acc1.getAccountID();
        acc1.getBalance();
        System.out.println(acc1.getName());
        System.out.println(acc1.getAddress());
        System.out.println(acc1.getAccountID());
        System.out.println(acc1.getBalance());
        acc1.addInterest();
        System.out.println("");
    }

}
