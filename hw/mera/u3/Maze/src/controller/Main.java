/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author heiso
 */
import controller.MazeController;

public class Main {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;
        
        MazeController controller = new MazeController(width, height);
        controller.displayMaze();
    }
}