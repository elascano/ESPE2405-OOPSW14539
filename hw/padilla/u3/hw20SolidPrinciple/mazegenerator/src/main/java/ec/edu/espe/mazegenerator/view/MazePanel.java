
package ec.edu.espe.mazegenerator.view;


import ec.edu.espe.mazegenerator.controller.Maze;

/**
 *
 * @author Marco Padilla
 */
import javax.swing.*;
import java.awt.*;

public class MazePanel extends JPanel {
    private Maze maze;

    public void setMaze(Maze maze) {
        this.maze = maze;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (maze != null) {
            drawMaze(g);
        }
    }

    private void drawMaze(Graphics g) {
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int cellWidth = panelWidth / maze.getWidth();
        int cellHeight = panelHeight / maze.getHeight();

        g.setColor(Color.BLACK);
        
        for (int i = 0; i < maze.getHeight(); i++) {
            for (int j = 0; j < maze.getWidth(); j++) {
                if (maze.getVerticalWalls()[i][j]) {
                    g.drawLine(j * cellWidth, i * cellHeight, j * cellWidth, (i + 1) * cellHeight);
                }
                if (maze.getHorizontalWalls()[i][j]) {
                    g.drawLine(j * cellWidth, i * cellHeight, (j + 1) * cellWidth, i * cellHeight);
                }
            }
        }
    }
}
