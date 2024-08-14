/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazegenerator.controller;

import ec.espe.edu.mazegenerator.model.Room;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Yostin Sisalema,Code Master,DCCO-ESPE
 */
public class MazeGenerator implements IMazeGenerator {
    protected RandomGenerator randomGenerator;

    public MazeGenerator(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }
    @Override
    public void generateMaze(Room[][] maze, int entranceX, int entranceY, int exitX, int exitY) {
        Stack<int[]> stack = new Stack<>();
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        stack.push(new int[]{entranceX, entranceY});
        visited[entranceY][entranceX] = true;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];
            int[][] neighbors = {{x - 1, y}, {x + 1, y}, {x, y - 1}, {x, y + 1}};
            randomGenerator.randomizeArray(neighbors);

            for (int[] neighbor : neighbors) {
                int nx = neighbor[0];
                int ny = neighbor[1];
                if (isValid(nx, ny, maze) && !visited[ny][nx]) {
                    int direction = getDirection(x, y, nx, ny);
                    maze[y][x].getWall(direction).setState(false); // Abrir puerta en celda actual
                    maze[ny][nx].getWall((direction + 2) % 4).setState(false); // Abrir puerta opuesta en celda vecina
                    stack.push(new int[]{nx, ny});
                    visited[ny][nx] = true;
                }
            }
        }

        // Abrir la entrada y la salida
        maze[entranceY][entranceX].getWall(3).setState(false); // Abrir pared oeste en la entrada
        maze[exitY][exitX].getWall(1).setState(false); // Abrir pared este en la salida
    }

    private boolean isValid(int x, int y, Room[][] maze) {
        return x >= 0 && x < maze[0].length && y >= 0 && y < maze.length;
    }

    private int getDirection(int x1, int y1, int x2, int y2) {
        if (x1 < x2) return 1; // Este
        if (x1 > x2) return 3; // Oeste
        if (y1 < y2) return 2; // Sur
        if (y1 > y2) return 0; // Norte
        return -1;
    }

    private void randomizeArray(int[][] position) {
        for (int i = position.length - 1; i > 0; i--) {
            int index = randomGenerator.getRandomNumber(i + 1);
            int[] temp = position[i];
            position[i] = position[index];
            position[index] = temp;
        }
    }
}