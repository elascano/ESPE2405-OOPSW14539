
package ec.edu.espe.mazegenerator.controller;

/**
 *
 * @author Marco Padilla
 */
import java.util.Random;
import java.util.Stack;

public class SimpleMazeGenerator implements MazeGenerator {

    private static final int[] DX = {0, 1, 0, -1}; 
    private static final int[] DY = {1, 0, -1, 0}; 

    @Override
    public Maze generateMaze(int width, int height) {
        Maze maze = new Maze(width, height);
        boolean[][] visited = new boolean[height][width];
        Stack<Cell> stack = new Stack<>();
        Random rand = new Random();

        stack.push(new Cell(0, 0));
        visited[0][0] = true;

        while (!stack.isEmpty()) {
            Cell current = stack.peek();
            int x = current.x;
            int y = current.y;

            int[] directions = {0, 1, 2, 3};
            shuffleArray(directions, rand);
            boolean moved = false;

            for (int i = 0; i < 4; i++) {
                int nx = x + DX[directions[i]];
                int ny = y + DY[directions[i]];

                if (isValid(nx, ny, width, height) && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    stack.push(new Cell(nx, ny));
                    maze.removeWall(current, new Cell(nx, ny));
                    moved = true;
                    break;
                }
            }

            if (!moved) {
                stack.pop();
            }
        }

        return maze;
    }

    private boolean isValid(int x, int y, int width, int height) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    private void shuffleArray(int[] array, Random rand) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static class Cell {
        int x, y;
        Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
