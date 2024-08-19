package ec.edu.espe.mazegen.model;

import ec.edu.espe.mazegen.controller.MazeGenerator;

/**
 *
 * @author Leydi Oña
 */
public abstract class Maze {
    private int M;
    private int N;
    
    private Room[][] mazeIsOk;

    public Maze(int width, int height) {
        this.M = width;
        this.N = height;
        initializeMap();
    }
    
    private void initializeMap(){
        setMazeMap(new Room[getWidth()][getHeight()]);
        
        for(int j=0;j<getHeight();j++){
            for(int i=0;i<getWidth();i++){
                getMazeMap()[i][j] = new Room(i,j);
           }
        }
        
        MazeGenerator mzgen = new MazeGenerator();
        mzgen.generateMaze(mazeIsOk);
    }
    
    public abstract void displayMaze();

    /**
     * @return the M
     */
    public int getWidth() {
        return M;
    }

    /**
     * @param width the M to set
     */
    public void setWidth(int width) {
        this.M = width;
    }

    /**
     * @return the N
     */
    public int getHeight() {
        return N;
    }

    /**
     * @param height the N to set
     */
    public void setHeight(int height) {
        this.N = height;
    }

    /**
     * @return the mazeIsOk
     */
    public Room[][] getMazeMap() {
        return mazeIsOk;
    }

    /**
     * @param mazeMap the mazeIsOk to set
     */
    public void setMazeMap(Room[][] mazeMap) {
        this.mazeIsOk = mazeMap;
    }
    
}
