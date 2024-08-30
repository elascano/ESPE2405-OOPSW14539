
package ec.espe.edu.mazegenerator.controller;

import ec.espe.edu.mazegenerator.model.Room;

/**
 *
 * @author Alvarado Grefa Frank, As Byte Wizards, DCCO-ESPE
 */
public interface InterfaceMazeGenerator {
    public boolean validateDirection(int direction, Room currentRoom);
    public boolean validateNorth(Room currentRoom);
    public boolean validateWest(Room currentRoom);
    public boolean validateSouth(Room currentRoom);
    public boolean validateEast(Room currentRoom);
}
