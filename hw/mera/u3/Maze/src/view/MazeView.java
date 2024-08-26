/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author heiso
 */
import model.Maze;
import model.Room;

public class MazeView {
    public void printMaze(Maze maze) {
        Room[][] rooms = maze.getRooms();
        for (int y = 0; y < rooms[0].length; y++) {
            // Imprimir paredes superiores
            for (int x = 0; x < rooms.length; x++) {
                System.out.print(rooms[x][y].hasTopWall() ? "+---" : "+   ");
            }
            System.out.println("+");
            // Imprimir paredes laterales
            for (int x = 0; x < rooms.length; x++) {
                System.out.print(rooms[x][y].hasLeftWall() ? "|   " : "    ");
            }
            System.out.println("|");
        }
        // Imprimir la última línea de paredes inferiores
        for (int x = 0; x < rooms.length; x++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }
}