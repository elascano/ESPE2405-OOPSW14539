/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazegenerator.controller;

import ec.espe.edu.mazegenerator.model.Maze;
import java.util.Random;

/**
 *
 * @author Sigcha Kenned, PPS,DCCO-ESPE
 */
public class MazeController {
    private final Maze maze;
    private final MazeGenerator mazeGenerator;
    private final MazePrinter mazePrinter;
    private final RandomGenerator randomGenerator;
    private int entranceX, entranceY, exitX, exitY;

    public MazeController(Maze maze, MazeGenerator mazeGenerator, MazePrinter mazePrinter, RandomGenerator randomGenerator) {
        this.maze = maze;
        this.mazeGenerator = mazeGenerator;
        this.mazePrinter = mazePrinter;
        this.randomGenerator = randomGenerator;
        initializeMaze();
    }

    private void initializeMaze() {
        entranceX = 0;
        entranceY = randomGenerator.getRandomNumber(maze.getHeight());
        exitX = maze.getWidth() - 1;
        exitY = randomGenerator.getRandomNumber(maze.getHeight());
        maze.getRoom(entranceX, entranceY).openDoor(3);
    }


    public void createMaze() {
        mazeGenerator.generateMaze(maze.getMaze(), entranceX, entranceY, exitX, exitY);
    }

    public void printMaze() {
        System.out.print(mazePrinter.getMazeAsString(maze, entranceX, entranceY, exitX, exitY));
    }

}

