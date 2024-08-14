/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerate.controller;

import ec.edu.espe.mazegenerate.model.*;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class MazePrinter {
    public void print(Maze maze) {
        char[][] grid = maze.getGrid();
        for (int y = 0; y < maze.getHeight(); y++) {
            for (int x = 0; x < maze.getWidth(); x++) {
                System.out.print(grid[y][x]);
            }
            System.out.println();
        }
    }
}
