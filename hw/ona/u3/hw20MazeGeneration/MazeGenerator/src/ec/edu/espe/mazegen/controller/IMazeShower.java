package ec.edu.espe.mazegen.controller;

import ec.edu.espe.mazegen.model.Room;

/**
 *
 * @author Leydi Oña
 */
public interface IMazeShower {
    
    public boolean validateDirection(int direction, Room currentRoom);
    
    public boolean validateNorth(Room currentRoom);
    
    public boolean validateWest(Room currentRoom);
    
    public boolean validateSouth(Room currentRoom);
    
    public boolean validateEast(Room currentRoom);
    
}
