/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10;

/**
 *
 * @author DOLPHIN
 */
public class circle {

    private double radius = 1.0;
    private String color = "red";

    public circle() {

    }

    public circle(double c) {
        radius = c;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
