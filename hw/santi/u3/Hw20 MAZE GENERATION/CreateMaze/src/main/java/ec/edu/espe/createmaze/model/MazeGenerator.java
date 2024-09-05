
package ec.edu.espe.createmaze.model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Sjean
 */
public class MazeGenerator {
    private int width;
    private int height;
    private Cell[][] maze;

    public MazeGenerator(int width, int height) {
        this.width = width;
        this.height = height;
        this.maze = new Cell[width][height];
        initializeMaze();
    }

    private void initializeMaze() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                maze[x][y] = new Cell(x, y);
            }
        }
    }

    public Maze generateMaze() {
        Stack<Cell> stack = new Stack<>();
        Cell current = maze[0][0];
        current.setVisited(true);

        do {
            ArrayList<Cell> unvisitedNeighbors = getUnvisitedNeighbors(current);
            if (!unvisitedNeighbors.isEmpty()) {
                Cell next = unvisitedNeighbors.get(new Random().nextInt(unvisitedNeighbors.size()));
                removeWall(current, next);
                stack.push(current);
                current = next;
                current.setVisited(true);
            } else if (!stack.isEmpty()) {
                current = stack.pop();
            }
        } while (!stack.isEmpty());

        setEntranceAndExit();
        return new Maze(maze);
    }

    private ArrayList<Cell> getUnvisitedNeighbors(Cell cell) {
        ArrayList<Cell> neighbors = new ArrayList<>();
        int x = cell.getX();
        int y = cell.getY();

        if (x > 0 && !maze[x-1][y].isVisited()) neighbors.add(maze[x-1][y]);
        if (x < width-1 && !maze[x+1][y].isVisited()) neighbors.add(maze[x+1][y]);
        if (y > 0 && !maze[x][y-1].isVisited()) neighbors.add(maze[x][y-1]);
        if (y < height-1 && !maze[x][y+1].isVisited()) neighbors.add(maze[x][y+1]);

        return neighbors;
    }

    private void removeWall(Cell current, Cell next) {
        int dx = next.getX() - current.getX();
        int dy = next.getY() - current.getY();

        if (dx == 1) {
            current.setEastWall(false);
            next.setWestWall(false);
        } else if (dx == -1) {
            current.setWestWall(false);
            next.setEastWall(false);
        } else if (dy == 1) {
            current.setSouthWall(false);
            next.setNorthWall(false);
        } else if (dy == -1) {
            current.setNorthWall(false);
            next.setSouthWall(false);
        }
    }

    private void setEntranceAndExit() {
        maze[0][0].setNorthWall(false);
        maze[width-1][height-1].setSouthWall(false);
    }
}