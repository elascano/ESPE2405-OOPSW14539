/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazegenerator.model;

/**
 *
 * @author Yostin Sisalema
 */
public class Wall {
    private String direction;
    private boolean state;

    public Wall(int type) {
        switch(type){
            case 0 -> { 
                direction = "North";
                state = true;
               }
            case 1 -> { 
                direction = "West";
                state = true;
               }
            case 2 -> { 
                direction = "South";
                state = true;
               }
            case 3 -> { 
                direction = "East";
                state = true;
               }
            default -> {
               }
        }
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * @return the state
     */
    public boolean getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(boolean state) {
        this.state = state;
    } 
}
