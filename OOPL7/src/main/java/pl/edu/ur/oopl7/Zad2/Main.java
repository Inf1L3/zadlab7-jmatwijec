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
public class Main {

    public static void main(String[] args) {
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3 = new Punkt3D[100];
        for (int i = 0; i <= 99; i++) {
            array2D[i] = new Punkt2D();
            array2D[i].losowanie();
            array3[i] = new Punkt3D();
            array3[i].losowanie();

        }
        for (int i = 0; i < 100; i++) {
            if (array2D[i].getPunkt_x() == array3[i].getPunkt_x() && array2D[i].getPunkt_y() == array3[i].getPunkt_y()) {
                System.out.println(array2D[i].toString());
                System.out.println(array3[i].toString());
            }
        }
    }
}
