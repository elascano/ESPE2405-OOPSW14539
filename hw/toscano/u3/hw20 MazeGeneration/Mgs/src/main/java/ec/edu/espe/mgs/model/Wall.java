package ec.edu.espe.mgs.model;

import java.util.Optional;

/**
 *
* @author Damian Toscano
*/
public class Wall {

    private boolean isExternal;
    private Optional<Room> room1;
    private Optional<Room> room2;

    public Wall(boolean isExternal) {
        this.isExternal = isExternal;
        this.room1 = Optional.empty();
        this.room2 = Optional.empty();
    }

    public void setAsExternal() {
        this.isExternal = true;
    }

    public void addAdjacentRoom(Room room) {
        if (room1.isEmpty()) {
            room1 = Optional.of(room);
        } else {
            room2 = Optional.of(room);
        }
    }

    public boolean isExternalWall() {
        return isExternal;
    }
}
