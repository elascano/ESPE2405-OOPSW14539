
package ec.edu.espe.mazegenerator.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick Tufiño
 */
public class Room {
    private final int x;
    private final int y;
    private final List<Door> doors;

    public Room(int x, int y) {
        this.x = x;
        this.y = y;
        this.doors = new ArrayList<>();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void addDoor(Door door) {
        doors.add(door);
    }
}
