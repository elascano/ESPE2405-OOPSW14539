/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author heiso
 */
import java.util.Random;

public class Maze {
    private Room[][] rooms;
    private int width;
    private int height;
    
    public Maze(int width, int height) {
        this.width = width;
        this.height = height;
        this.rooms = new Room[width][height];
        generateMaze();
    }
    
    private void generateMaze() {
        // Inicializar cuartos
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                rooms[i][j] = new Room();
            }
        }
        
        // Generar una ruta aleatoria desde la entrada hasta la salida
        Random random = new Random();
        int x = 0, y = 0;
        int exitX = width - 1, exitY = height - 1;

        while (x != exitX || y != exitY) {
            int direction = random.nextInt(4);
            switch (direction) {
                case 0: // Moverse hacia arriba
                    if (y > 0) {
                        rooms[x][y].setTopWall(false);
                        y--;
                        rooms[x][y].setBottomWall(false);
                    }
                    break;
                case 1: // Moverse hacia abajo
                    if (y < height - 1) {
                        rooms[x][y].setBottomWall(false);
                        y++;
                        rooms[x][y].setTopWall(false);
                    }
                    break;
                case 2: // Moverse hacia la izquierda
                    if (x > 0) {
                        rooms[x][y].setLeftWall(false);
                        x--;
                        rooms[x][y].setRightWall(false);
                    }
                    break;
                case 3: // Moverse hacia la derecha
                    if (x < width - 1) {
                        rooms[x][y].setRightWall(false);
                        x++;
                        rooms[x][y].setLeftWall(false);
                    }
                    break;
            }
        }
        
        // Eliminar las paredes exteriores en la entrada y la salida
        rooms[0][0].setLeftWall(false);
        rooms[exitX][exitY].setRightWall(false);
    }
    
    public Room[][] getRooms() {
        return rooms;
    }
}