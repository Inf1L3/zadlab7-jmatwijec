/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.Zad2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Kuba
 */
public class Punkt3D extends Punkt2D {

    private int punkt_z;

    public Punkt3D(int punkt_z, int punkt_x, int punkt_y) {
        super(punkt_x, punkt_y);
        this.punkt_z = punkt_z;
    }

    public Punkt3D() {
        super(0, 0);
        this.punkt_z = 0;
    }

    @Override
    public void losowanie() {
        super.losowanie();
        this.punkt_z = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
    }

    @Override
    public String toString() {

        
        return "x" + super.getPunkt_x() + "y" + super.getPunkt_y() + "z" + this.punkt_z;
    }
}
