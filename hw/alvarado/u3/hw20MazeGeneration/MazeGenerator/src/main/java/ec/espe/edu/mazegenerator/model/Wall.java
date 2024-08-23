package ec.espe.edu.mazegenerator.model;

/**
 *
 * @author Alvarado Grefa Frank, As Byte Wizards, DCCO-ESPE
 */
public class Wall {
   private String direction;
    private boolean state;

    public Wall(int type) {
        switch(type){
            case 0 : 
                direction = "North";
                state = true;
                break;
            case 1 : 
                direction = "West";
                state = true;
                break;
            case 2 : 
                direction = "South";
                state = true;
                break;
            case 3 : 
                direction = "East";
                state = true;
                break;
            default:
                break;
        }
    }
    
    

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * @return the state
     */
    public boolean getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(boolean state) {
        this.state = state;
    } 
}
