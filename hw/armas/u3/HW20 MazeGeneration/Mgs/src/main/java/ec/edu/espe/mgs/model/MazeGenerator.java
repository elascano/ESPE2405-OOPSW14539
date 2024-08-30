package ec.edu.espe.mgs.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class MazeGenerator {

    private Maze maze;
    private Random random = new Random();

    public MazeGenerator(int width, int height) {
        maze = new Maze(width, height);
        generateMaze();
    }

    public Maze getMaze() {
        return maze;
    }

    private void generateMaze() {
        List<Room> rooms = new ArrayList<>();
        for (int x = 0; x < maze.getWidth(); x++) {
            for (int y = 0; y < maze.getHeight(); y++) {
                rooms.add(maze.getRoom(x, y));
            }
        }

        Collections.shuffle(rooms, random);

        for (Room room : rooms) {
            connectAdjacentRooms(room);
        }

        setEntranceAndExit();
    }

    private void connectAdjacentRooms(Room room) {
        int x = room.getX();
        int y = room.getY();

        List<Room> adjacentRooms = new ArrayList<>();
        if (x > 0) {
            adjacentRooms.add(maze.getRoom(x - 1, y)); // left
        }
        if (x < maze.getWidth() - 1) {
            adjacentRooms.add(maze.getRoom(x + 1, y)); // right
        }
        if (y > 0) {
            adjacentRooms.add(maze.getRoom(x, y - 1)); // top
        }
        if (y < maze.getHeight() - 1) {
            adjacentRooms.add(maze.getRoom(x, y + 1)); // bottom
        }
        Collections.shuffle(adjacentRooms, random);

        for (Room adjacent : adjacentRooms) {
            if (!room.hasDoorTo(adjacent)) {
                Door door = new Door(room, adjacent);
                maze.connectRooms(room, adjacent, door);
            }
        }
    }

    private void removeWalls(Room room1, Room room2) {
        if (room1.getX() == room2.getX()) {
            if (room1.getY() < room2.getY()) {
                room1.removeWallBelow();
                room2.removeWallAbove();
            } else {
                room1.removeWallAbove();
                room2.removeWallBelow();
            }
        } else {
            if (room1.getX() < room2.getX()) {
                room1.removeWallToRight();
                room2.removeWallToLeft();
            } else {
                room1.removeWallToLeft();
                room2.removeWallToRight();
            }
        }
    }

    private void setEntranceAndExit() {
        Room entrance = maze.getRoom(0, 0);
        Room exit = maze.getRoom(maze.getWidth() - 1, maze.getHeight() - 1);

        maze.setEntranceAndExit(entrance, exit);
    }
}
