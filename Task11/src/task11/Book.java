/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task11;

/**
 *
 * @author DOLPHIN
 */
public class Book {

    String title;
    String author;
    double price;

    public Book(String t, String a, double p) {
        this.title = t;
        this.author = a;
        this.price = p;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String toString() {
        String a = title + "\t" + author + "\t" + price;
        return a;
    }
}
