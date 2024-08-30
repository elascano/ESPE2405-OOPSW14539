package ec.edu.espe.mazegen.controller;

import ec.edu.espe.mazegen.model.Room;

/**
 *
 * @author Leidy Saraguro
 * @author Paradigm Pioneers Squad, DCCO-ESPE
 */
public interface IMazeHandler {
    
    public boolean validateDirection(int direction, Room currentRoom);
    
    public boolean validateNorth(Room currentRoom);
    
    public boolean validateWest(Room currentRoom);
    
    public boolean validateSouth(Room currentRoom);
    
    public boolean validateEast(Room currentRoom);
    
}
