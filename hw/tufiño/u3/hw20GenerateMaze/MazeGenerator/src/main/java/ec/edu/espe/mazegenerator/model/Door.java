
package ec.edu.espe.mazegenerator.model;

/**
 *
 * @author Erick Tufiño
 */
public class Door {
    private final Room room1;
    private final Room room2;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room getRoom1() {
        return room1;
    }

    public Room getRoom2() {
        return room2;
    }  
}
