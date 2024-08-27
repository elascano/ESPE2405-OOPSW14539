package ec.edu.espe.mgs.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
* @author Damian Toscano
*/
public class PathFinder {

    public List<Room> findPath(Room start, Room end) {
        List<Room> path = new ArrayList<>();
        Set<Room> visited = new HashSet<>();
        if (findPathRecursive(start, end, path, visited)) {
            return path;
        }
        return new ArrayList<>(); // Return empty path if no path is found
    }

    private boolean findPathRecursive(Room current, Room end, List<Room> path, Set<Room> visited) {
        path.add(current);
        visited.add(current);

        if (current.equals(end)) {
            return true;
        }

        for (Room adjacent : current.getAdjacentRooms()) {
            if (!visited.contains(adjacent) && isPathValid(current, adjacent)) {
                if (findPathRecursive(adjacent, end, path, visited)) {
                    return true;
                }
            }
        }

        path.remove(current);
        return false;
    }

    private boolean isPathValid(Room current, Room adjacent) {
        // Check if there's a door between the rooms
        return current.hasDoorTo(adjacent);
    }

    public boolean verifyPath(Maze maze, List<Room> path) {
        if (path.isEmpty() || !path.get(0).equals(maze.getEntrance()) || !path.get(path.size() - 1).equals(maze.getExit())) {
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
}
