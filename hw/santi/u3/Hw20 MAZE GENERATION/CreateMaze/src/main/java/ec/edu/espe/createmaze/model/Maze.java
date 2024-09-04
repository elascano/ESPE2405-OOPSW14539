
package ec.edu.espe.createmaze.model;

/**
 *
 * @author Sjean
 */
public class Maze {
    private Cell[][] cells;

    public Maze(Cell[][] cells) {
        this.cells = cells;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public int getWidth() {
        return cells.length;
    }

    public int getHeight() {
        return cells[0].length;
    }
}