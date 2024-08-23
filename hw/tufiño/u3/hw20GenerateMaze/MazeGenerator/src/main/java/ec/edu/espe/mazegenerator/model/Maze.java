
package ec.edu.espe.mazegenerator.model;
import java.util.List;

/**
 *
 * @author Erick Tufiño
 */
public class Maze {
    private final Room[][] rooms;
    private final Room entrance;
    private final Room exit;

    public Maze(Room[][] rooms, Room entrance, Room exit) {
        this.rooms = rooms;
        this.entrance = entrance;
        this.exit = exit;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public Room getEntrance() {
        return entrance;
    }

    public Room getExit() {
        return exit;
    }
}
