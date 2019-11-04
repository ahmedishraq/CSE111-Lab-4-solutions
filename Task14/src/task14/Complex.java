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
public class Complex {

    double realPart;
    double imaginaryPart;

    public Complex() {
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double r, double i) {
        realPart = r;
        imaginaryPart = i;
    }

    public Complex add(Complex a, Complex b) {
        Complex xyz = new Complex();
        xyz.realPart = a.realPart + b.realPart;
        xyz.imaginaryPart = a.imaginaryPart + b.imaginaryPart;
        return xyz;
    }

    public Complex subtract(Complex a, Complex b) {
        Complex xyz = new Complex();
        xyz.realPart = a.realPart - b.realPart;
        xyz.imaginaryPart = a.imaginaryPart - b.imaginaryPart;
        return xyz;
    }

    public Complex multiply(Complex a, Complex b) {
        Complex xyz = new Complex();
        xyz.realPart = a.realPart * b.realPart;
        xyz.imaginaryPart = a.imaginaryPart * b.imaginaryPart;
        return xyz;
    }

    public Complex divide(Complex a, Complex b) {
        Complex xyz = new Complex();
        xyz.realPart = a.realPart / b.realPart;
        xyz.imaginaryPart = a.imaginaryPart / b.imaginaryPart;
        return xyz;
    }

    public void setRealPart(double r) {
        this.realPart = r;
    }

    public void setImaginaryPart(double i) {
        this.imaginaryPart = i;
    }

    public double getRealPart() {
        return this.realPart;
    }

    public double getImaginaryPart() {
        return this.imaginaryPart;
    }

    public String toString() {
        String a = realPart + "\t" + imaginaryPart + 'i';
        return a;
    }
}
