/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author heiso
 */
import model.Maze;
import view.MazeView;

public class MazeController {
    private Maze maze;
    private MazeView view;
    
    public MazeController(int width, int height) {
        maze = new Maze(width, height);
        view = new MazeView();
    }
    
    public void displayMaze() {
        view.printMaze(maze);
    }
}