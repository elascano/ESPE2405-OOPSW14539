/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author heiso
 */
public class Room {
    private boolean topWall = true;
    private boolean bottomWall = true;
    private boolean leftWall = true;
    private boolean rightWall = true;
    
    // Getters y setters
    public boolean hasTopWall() { return topWall; }
    public void setTopWall(boolean topWall) { this.topWall = topWall; }

    public boolean hasBottomWall() { return bottomWall; }
    public void setBottomWall(boolean bottomWall) { this.bottomWall = bottomWall; }

    public boolean hasLeftWall() { return leftWall; }
    public void setLeftWall(boolean leftWall) { this.leftWall = leftWall; }

    public boolean hasRightWall() { return rightWall; }
    public void setRightWall(boolean rightWall) { this.rightWall = rightWall; }
}
