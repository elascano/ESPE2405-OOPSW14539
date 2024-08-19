package ec.edu.espe.createmaze.model;

/**
 *
 * @author Sjean
 */
public class Cell {
    private int x, y;
    private boolean northWall, southWall, eastWall, westWall;
    private boolean visited;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.northWall = true;
        this.southWall = true;
        this.eastWall = true;
        this.westWall = true;
        this.visited = false;
    }

    // Getters and setters
    public int getX() { return x; }
    public int getY() { return y; }
    public boolean hasNorthWall() { return northWall; }
    public boolean hasSouthWall() { return southWall; }
    public boolean hasEastWall() { return eastWall; }
    public boolean hasWestWall() { return westWall; }
    public boolean isVisited() { return visited; }

    public void setNorthWall(boolean northWall) { this.northWall = northWall; }
    public void setSouthWall(boolean southWall) { this.southWall = southWall; }
    public void setEastWall(boolean eastWall) { this.eastWall = eastWall; }
    public void setWestWall(boolean westWall) { this.westWall = westWall; }
    public void setVisited(boolean visited) { this.visited = visited; }
}