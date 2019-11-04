/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task12;

/**
 *
 * @author DOLPHIN
 */
public class Author {

    String firstName;
    String lastName;

    public Author(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public void setFirstName(String f) {
        this.firstName = f;
    }

    public void setLastName(String l) {
        this.lastName = l;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        String a = firstName + " " + lastName;
        return a;
    }
}
