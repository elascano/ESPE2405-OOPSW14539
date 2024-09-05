
package ec.edu.espe.createmaze.view;

import ec.edu.espe.createmaze.model.Cell;
import ec.edu.espe.createmaze.model.MazeModel;
import javax.swing.*;
import java.awt.*;

public class MazeView extends JPanel {
    private MazeModel model;
    private int cellSize = 20;

    public MazeView(MazeModel model) {
        this.model = model;
        model.addObserver(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (model.getMaze() != null) {
            Cell[][] cells = model.getMaze().getCells();
            for (int x = 0; x < cells.length; x++) {
                for (int y = 0; y < cells[x].length; y++) {
                    int xPos = x * cellSize;
                    int yPos = y * cellSize;
                    Cell cell = cells[x][y];

                    if (cell.hasNorthWall()) g.drawLine(xPos, yPos, xPos + cellSize, yPos);
                    if (cell.hasSouthWall()) g.drawLine(xPos, yPos + cellSize, xPos + cellSize, yPos + cellSize);
                    if (cell.hasEastWall()) g.drawLine(xPos + cellSize, yPos, xPos + cellSize, yPos + cellSize);
                    if (cell.hasWestWall()) g.drawLine(xPos, yPos, xPos, yPos + cellSize);
                }
            }
        }
    }

    public void update() {
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        if (model.getMaze() != null) {
            return new Dimension(model.getMaze().getWidth() * cellSize, model.getMaze().getHeight() * cellSize);
        }
        return new Dimension(400, 400);
    }
}