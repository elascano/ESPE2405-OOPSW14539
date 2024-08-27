package ec.edu.espe.mgs.view;

import ec.edu.espe.mgs.model.Maze;
import ec.edu.espe.mgs.model.Room;

/**
 *
* @author Damian Toscano
*/
public class ASCIIMazeView extends MazeView {

    @Override
    public void drawMaze(Maze maze) {
        int width = maze.getWidth();
        int height = maze.getHeight();

        for (int y = 0; y < height; y++) {
            // Draw top walls of each row
            for (int x = 0; x < width; x++) {
                Room room = maze.getRoom(x, y);
                System.out.print("+");
                System.out.print(room.hasWallAbove() ? "---" : "   ");
            }
            System.out.println("+");

            // Draw the side walls and room contents
            for (int x = 0; x < width; x++) {
                Room room = maze.getRoom(x, y);
                System.out.print(room.hasWallToLeft() ? "|" : " ");

                if (maze.isEntrance(room)) {
                    System.out.print(" S ");
                } else if (maze.isExit(room)) {
                    System.out.print(" E ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("|");

            // Draw bottom walls of each row
            for (int x = 0; x < width; x++) {
                Room room = maze.getRoom(x, y);
                System.out.print("+");
                System.out.print(room.hasWallBelow() ? "---" : "   ");
            }
            System.out.println("+");
        }
    }
}
