/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazegenerator.controller;

import ec.espe.edu.mazegenerator.model.Maze;

/**
 *
 * @author Yostin Sisalema
 */
public class MazePrinter {
        public String getMazeAsString(Maze maze, int entranceX, int entranceY, int exitX, int exitY) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maze.getHeight(); i++) {
            for (int j = 0; j < maze.getWidth(); j++) {
                sb.append("+");
                sb.append(maze.getRoom(j, i).getWall(0).getState() ? "---" : "   ");
            }
            sb.append("+\n");
            for (int j = 0; j < maze.getWidth(); j++) {
                sb.append(maze.getRoom(j, i).getWall(3).getState() ? "|" : " ");
                if (i == entranceY && j == entranceX) {
                    sb.append(" S ");
                } else if (i == exitY && j == exitX) {
                    sb.append(" E ");
                } else {
                    sb.append("   ");
                }
            }
            sb.append(maze.getRoom(maze.getWidth()-1, i).getWall(1).getState() ? "|\n" : " \n");
        }
        for (int j = 0; j < maze.getWidth(); j++) {
            sb.append("+---");
        }
        sb.append("+\n");
        
        return sb.toString();
    }
}
