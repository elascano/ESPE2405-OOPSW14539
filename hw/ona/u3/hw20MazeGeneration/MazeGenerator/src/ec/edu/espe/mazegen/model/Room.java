package ec.edu.espe.mazegen.model;

/**
 *
 * @author Leydi Oña
 */
public class Room {
    private int X;
    private int Y;
    private Wall[] walls = new Wall[4];
    private String type;
    private boolean passed;

    public Room(int posX, int posY) {
        this.X = posX;
        this.Y = posY;
        this.type = "default";
        this.passed = false;
        
        initializeWalls();
    }
    
    private void initializeWalls(){
        for(int i=0;i<4;i++){
            getWalls()[i] = new Wall(i);
        }
    }

    /**
     * @return the X
     */
    public int getPosX() {
        return X;
    }

    /**
     * @param posX the X to set
     */
    public void setPosX(int posX) {
        this.X = posX;
    }

    /**
     * @return the Y
     */
    public int getPosY() {
        return Y;
    }

    /**
     * @param posY the Y to set
     */
    public void setPosY(int posY) {
        this.Y = posY;
    }

    /**
     * @return the walls
     */
    public Wall[] getWalls() {
        return walls;
    }

    /**
     * @param walls the walls to set
     */
    public void setWalls(Wall[] walls) {
        this.walls = walls;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the passed
     */
    public boolean isPassed() {
        return passed;
    }

    /**
     * @param passed the passed to set
     */
    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    
    
}
