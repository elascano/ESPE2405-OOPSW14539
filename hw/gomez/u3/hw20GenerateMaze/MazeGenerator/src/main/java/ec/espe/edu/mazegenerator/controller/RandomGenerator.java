/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazegenerator.controller;

import java.util.Random;

/**
 *
 * @author PAOLA-SSD
 */
public class RandomGenerator {
    private Random random = new Random();

    public int getRandomNumber(int max) {
        return random.nextInt(max);
    }

    public void randomizeArray(int[][] randomize) {
        for (int i = randomize.length - 1; i > 0; i--) {
            int index = getRandomNumber(i + 1);
            int[] temp = randomize[i];
            randomize[i] = randomize[index];
            randomize[index] = temp;
        }
    }
}
