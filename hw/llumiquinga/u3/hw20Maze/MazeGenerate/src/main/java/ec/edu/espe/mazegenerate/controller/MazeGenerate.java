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
public class MazeGenerate {
     private final Maze maze;
    private final Wall walls;
    private final Room rooms;
    private final RandomGenerator randomGen;

    public MazeGenerate(Maze maze, Wall wall, Room room) {
        this.maze = maze;
        this.walls = wall;
        this.rooms = room;
        this.randomGen = new RandomGenerator();
    }

    public void generate() {
        int width = maze.getWidth();
        int height = maze.getHeight();
        char[][] grid = maze.getGrid();

        // Inicializar el laberinto con paredes
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                grid[y][x] = walls.getSymbol();
            }
        }

        // Crear entrada y salida
        grid[1][0] = 'E';  // Entrada
        grid[height - 2][width - 1] = 'S';  // Salida

        // Generar caminos usando DFS modificado
        createPath(1, 1);

        maze.setGrid(grid);
    }

    private void createPath(int x, int y) {
        char[][] grid = maze.getGrid();
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        randomGen.shuffleArray(dx, dy);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i] * 2;
            int ny = y + dy[i] * 2;
            if (isValid(nx, ny)) {
                grid[ny][nx] = rooms.getSymbol();
                grid[y + dy[i]][x + dx[i]] = rooms.getSymbol();
                createPath(nx, ny);
            }
        }
    }

    private boolean isValid(int x, int y) {
        if (x <= 0 || x >= maze.getWidth() - 1 || y <= 0 || y >= maze.getHeight() - 1) {
            return false;
        }
        return maze.getGrid()[y][x] == walls.getSymbol();
    }
}
