/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task13;

/**
 *
 * @author DOLPHIN
 */
public class Clock {

    int hours;
    int minutes;
    int seconds;

    public Clock() {
        int hours = 12;
        int minutes = 0;
        int seconds = 0;
    }

    public Clock(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public Clock(int i) {
        this.hours = i / 3600;
        i = i % 3600;
        this.minutes = i / 60;
        this.seconds = i % 60;
    }

    public void setClock(int i) {
        this.hours = i / 3600;
        i = i % 3600;
        this.minutes = i / 60;
        this.seconds = i % 60;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setHours(int h) {
        this.hours = h;
    }

    public void setMinutes(int m) {
        this.minutes = m;
    }

    public void setSeconds(int s) {
        this.seconds = s;
    }

    public void tick() {
        int v = hours * 3600 + minutes * 60 + seconds + 1;
        setClock(v);
    }

    public void addClock(Clock c) {
        int s1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int s2 = c.hours * 3600 + c.minutes * 60 + c.seconds;
        int s = s1 + s2;
        setClock(s);
    }

    public String toString() {
        String a = hours + ":" + minutes + ":" + seconds;
        return a;
    }

    public void tickDown() {
        int v = hours * 3600 + minutes * 60 + seconds - 1;
        setClock(v);
    }

    public void subtractClock(Clock c) {
        int s1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int s2 = c.hours * 3600 + c.minutes * 60 + c.seconds;
        int s = s1 - s2;
        setClock(s);
    }
}
