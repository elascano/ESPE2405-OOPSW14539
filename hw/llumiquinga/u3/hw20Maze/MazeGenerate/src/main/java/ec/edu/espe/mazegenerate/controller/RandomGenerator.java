/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerate.controller;

import java.util.Random;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class RandomGenerator {
    private final Random random = new Random();

    public void shuffleArray(int[] dx, int[] dy) {
        for (int i = 0; i < 4; i++) {
            int r = random.nextInt(4);
            int tempX = dx[i];
            dx[i] = dx[r];
            dx[r] = tempX;
            int tempY = dy[i];
            dy[i] = dy[r];
            dy[r] = tempY;
        }
    }
}
