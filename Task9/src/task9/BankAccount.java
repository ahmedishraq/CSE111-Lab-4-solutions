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
public class BankAccount {

    String name;
    String address;
    String accountID;
    double balance;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String i) {
        accountID = i;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double c) {
        balance = c;
    }

    public void addInterest() {
        balance = balance + (balance * (7 / 100));
        System.out.println(balance);
    }
}
