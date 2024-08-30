/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazegenerator.controller;

import ec.espe.edu.mazegenerator.model.Room;

/**
 *
 * @author Yostin Sisalema,Code Master,DCCO-ESPE
 */
public interface IMazeGenerator {
    public void generateMaze(Room[][] maze, int entranceX, int entranceY, int exitX, int exitY);
}
