package ec.edu.espe.mgs.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario Anrrango, A-Byte Wizards, DCCO-ESPE
 */
public class Room {

    private List<Door> doors;
    private boolean hasLeftWall;
    private boolean hasTopWall;
    private boolean hasRightWall;
    private boolean hasBottomWall;
    private int x;
    private int y;

    public Room(int x, int y) {
        this.x = x;
        this.y = y;
        this.doors = new ArrayList<>();
        this.hasLeftWall = true;
        this.hasTopWall = true;
        this.hasRightWall = true;
        this.hasBottomWall = true;
    }

    public void addDoor(Door door) {
        doors.add(door);
    }

    public boolean hasWallToLeft() {
        return hasLeftWall;
    }

    public boolean hasWallAbove() {
        return hasTopWall;
    }

    public boolean hasWallToRight() {
        return hasRightWall;
    }

    public boolean hasWallBelow() {
        return hasBottomWall;
    }

    public void removeWallToLeft() {
        this.hasLeftWall = false;
    }

    public void removeWallAbove() {
        this.hasTopWall = false;
    }

    public void removeWallToRight() {
        this.hasRightWall = false;
    }

    public void removeWallBelow() {
        this.hasBottomWall = false;
    }

    public List<Room> getAdjacentRooms() {
        List<Room> adjacentRooms = new ArrayList<>();
        for (Door door : doors) {
            adjacentRooms.add(door.getOtherRoom(this));
        }
        return adjacentRooms;
    }

    public boolean hasDoorTo(Room otherRoom) {
        for (Door door : doors) {
            if (door.getOtherRoom(this).equals(otherRoom)) {
                return true;
            }
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
