/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazegenerator.model;

/**
 *
 * @author Yostin Sisalema,Code Master,DCCO-ESPE
 */
public class Room {
    private Wall[] walls;
    public Room() {
        walls = new Wall[4];
        for (int i = 0; i < 4; i++) {
            walls[i] = new Wall(i);
        }
    }

    public boolean hasDoor(int direction) {
        return !walls[direction].getState();
    }

    public void openDoor(int direction) {
        walls[direction].setState(false);
    }

    public Wall getWall(int direction) {
        return walls[direction];
    }

}
