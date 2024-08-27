package ec.edu.espe.mgs.controller;

import ec.edu.espe.mgs.model.Maze;
import ec.edu.espe.mgs.model.MazeGenerator;
import ec.edu.espe.mgs.model.PathFinder;
import ec.edu.espe.mgs.model.Room;
import ec.edu.espe.mgs.view.ASCIIMazeView;
import java.util.List;
import java.util.Scanner;

/**
 *
* @author Damian Toscano
*/
public class MazeController {

    private Maze maze;
    private PathFinder pathFinder = new PathFinder();
    private ASCIIMazeView mazeView = new ASCIIMazeView();

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the maze: ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the maze: ");
        int height = scanner.nextInt();

        generateMaze(width, height);
        mazeView.drawMaze(maze);

        List<Room> path = pathFinder.findPath(maze.getRoom(0, 0), maze.getRoom(width - 1, height - 1));
        if (pathFinder.verifyPath(maze, path)) {
            System.out.println("Path verified and found from entrance to exit.");
        } else {
            System.out.println("No valid path found.");
        }
    }

    private void generateMaze(int width, int height) {
        MazeGenerator mazeGenerator = new MazeGenerator(width, height);
        this.maze = mazeGenerator.getMaze();
    }
}
