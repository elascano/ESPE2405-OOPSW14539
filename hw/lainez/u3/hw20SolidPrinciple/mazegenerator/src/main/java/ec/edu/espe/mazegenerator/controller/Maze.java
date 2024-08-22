/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.controller;

/**
 *
 * @author Lainez Ricardo
 */
public class Maze {
    private int width;
    private int height;
    private boolean[][] horizontalWalls;
    private boolean[][] verticalWalls;

    public Maze(int width, int height) {
        this.width = width;
        this.height = height;
        this.horizontalWalls = new boolean[height + 1][width];
        this.verticalWalls = new boolean[height][width + 1];
        initializeWalls();
    }

    private void initializeWalls() {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < width; j++) {
                horizontalWalls[i][j] = true;
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= width; j++) {
                verticalWalls[i][j] = true;
            }
        }
    }

    public void removeWall(SimpleMazeGenerator.Cell current, SimpleMazeGenerator.Cell next) {
        int x = (current.x + next.x) / 2;
        int y = (current.y + next.y) / 2;

        if (current.x == next.x) {
            horizontalWalls[y][current.x] = false;
        } else {
            verticalWalls[current.y][x] = false;
        }
    }

    public boolean[][] getHorizontalWalls() {
        return horizontalWalls;
    }

    public boolean[][] getVerticalWalls() {
        return verticalWalls;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
