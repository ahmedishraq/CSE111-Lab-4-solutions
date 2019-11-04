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
public class BoroInt {

    String val;

    public BoroInt() {
        this.val = "0";
    }

    public void BoroIntErModdheNumberCharaArKisuDeyaJaiNaException() {
        System.out.println("BoroIntErModdheNumberCharaArKisuDeyaJaiNaException ");
    }

    public BoroInt(String a) {
        this.val = a;
        BoroInt b1 = new BoroInt();
        char[] arr = val.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int ch = val.codePointAt(i);
            if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                b1.BoroIntErModdheNumberCharaArKisuDeyaJaiNaException();
                break;
            } else {
                this.val = a;
            }
        }
    }

    public BoroInt(int i) {
        int m = i;
        String str = Integer.toString(m);
        this.val = str;
    }

    /* public BoroInt() {
        BoroInt bi = new BoroInt("5");
        this.val = ;
    }*/
    public String trim(String val) {
        String a = val.trim();
        return a;
    }

    public boolean validValue(String val) {
        boolean a = true;
        val = val;
        char[] arr2 = val.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            int ch = val.codePointAt(i);
            if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                a = false;
            } else {
                a = true;
            }
        }
        return a;
    }

    public BoroInt add(BoroInt a) {
        BoroInt b2 = new BoroInt();
        b2.val = a.val + val;
        return b2;
    }
     /*public BoroInt subtract(BoroInt a) {
        BoroInt b2 = new BoroInt();
        b2.val = a.val - this.val;
        return b2;
    }*/

    public String toString() {
        String b = "result is :" + this.val;
        return b;
    }
}
