package ec.edu.espe.mgs.model;

import java.util.List;

/**
 *
* @author Damian Toscano
*/
public class Maze {

    private Room[][] rooms;
    private Room entrance;
    private Room exit;
    private int width;
    private int height;

    public Maze(int width, int height) {
        this.width = width;
        this.height = height;
        this.rooms = new Room[width][height];
        initializeRooms();
    }

    private void initializeRooms() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                rooms[x][y] = new Room(x, y);
            }
        }
    }

    public void setEntranceAndExit(Room entrance, Room exit) {
        this.entrance = entrance;
        this.exit = exit;
    }

    public Room getRoom(int x, int y) {
        return rooms[x][y];
    }

    public void connectRooms(Room room1, Room room2, Door door) {
        room1.addDoor(door);
        room2.addDoor(door);
        updateWalls(room1, room2);
    }

    private void updateWalls(Room room1, Room room2) {
        int x1 = room1.getX();
        int y1 = room1.getY();
        int x2 = room2.getX();
        int y2 = room2.getY();

        if (x1 == x2) {
            if (y1 < y2) {
                room1.removeWallBelow();
                room2.removeWallAbove();
            } else {
                room1.removeWallAbove();
                room2.removeWallBelow();
            }
        } else {
            if (x1 < x2) {
                room1.removeWallToRight();
                room2.removeWallToLeft();
            } else {
                room1.removeWallToLeft();
                room2.removeWallToRight();
            }
        }
    }

    public boolean verifyPath(List<Room> path) {
        if (path.isEmpty() || !path.get(0).equals(entrance) || !path.get(path.size() - 1).equals(exit)) {
            return false;
        }

        for (int i = 0; i < path.size() - 1; i++) {
            Room current = path.get(i);
            Room next = path.get(i + 1);
            if (!current.hasDoorTo(next)) {
                return false;
            }
        }
        return true;
    }

    public boolean isExit(Room room) {
        return room.equals(exit);
    }

    public boolean isEntrance(Room room) {
        return room.equals(entrance);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Room getEntrance() {
        return entrance;
    }

    public Room getExit() {
        return exit;
    }
}
