/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.Zad2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author student
 */
public class Punkt2D {

    private int punkt_x;
    private int punkt_y;

    public Punkt2D(int punkt_x, int punkt_y) {
        this.punkt_x = punkt_x;
        this.punkt_y = punkt_y;
    }

    public int getPunkt_x() {
        return punkt_x;
    }

    public void setPunkt_x(int punkt_x) {
        this.punkt_x = punkt_x;
    }

    public int getPunkt_y() {
        return punkt_y;
    }

    public void setPunkt_y(int punkt_y) {
        this.punkt_y = punkt_y;
    }

    public Punkt2D() {
        this.punkt_x = 0;
        this.punkt_y = 0;
    }

    public void losowanie() {
        this.punkt_x = ThreadLocalRandom.current().nextInt(-10, 10 + 1);//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        this.punkt_y = ThreadLocalRandom.current().nextInt(-10, 10 + 1);//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        
    }

    @Override
    public String toString() {
        
        return "x" + punkt_x + "y" + punkt_y;
    }
}
