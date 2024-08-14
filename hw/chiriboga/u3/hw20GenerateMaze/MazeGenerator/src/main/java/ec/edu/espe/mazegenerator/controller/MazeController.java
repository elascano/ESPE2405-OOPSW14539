package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.Cell;
import ec.edu.espe.mazegenerator.model.IMazeGenerator;
import ec.edu.espe.mazegenerator.model.RecursiveMazeGenerator;
import ec.edu.espe.mazegenerator.view.FrmMaze;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class MazeController {

    private FrmMaze view;
    private IMazeGenerator mazeGenerator;
    private int width, height;

    public MazeController(FrmMaze view) {
        this.view = view;
        this.mazeGenerator = new RecursiveMazeGenerator();
    }

    public void setMazeDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Cell[][] generateMaze() {
        if (width <= 0 || height <= 0) {
            view.showError("Width and height must be positive numbers.");
            return null;
        }
        return mazeGenerator.generateMaze(width, height);
    }

    public String printMaze(Cell[][] maze) {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                sb.append("+");
                sb.append(maze[x][y].topWall ? "---" : "   ");
            }
            sb.append("+\n");

            for (int x = 0; x < width; x++) {
                sb.append(maze[x][y].leftWall ? "|" : " ");
                if (maze[x][y].isEntrance) {
                    sb.append(" E ");
                } else if (maze[x][y].isExit) {
                    sb.append(" S ");
                } else {
                    sb.append("   ");
                }
            }
            sb.append("|\n");
        }
        for (int x = 0; x < width; x++) {
            sb.append("+");
            sb.append(maze[x][height - 1].bottomWall ? "---" : "   ");
        }
        sb.append("+\n");

        return sb.toString();
    }
}
