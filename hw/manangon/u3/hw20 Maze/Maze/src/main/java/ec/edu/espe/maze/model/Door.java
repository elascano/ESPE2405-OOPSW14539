package ec.edu.espe.maze.model;

/**
 *
 * @author Zaith Manangon, DCCO-ESPE
 */
public class Door {

    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = true; // By default, doors are open
    }

    public Room getOtherRoom(Room currentRoom) {
        if (currentRoom.equals(room1)) {
            return room2;
        } else if (currentRoom.equals(room2)) {
            return room1;
        }
        throw new IllegalArgumentException("Room not connected by this door.");
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
