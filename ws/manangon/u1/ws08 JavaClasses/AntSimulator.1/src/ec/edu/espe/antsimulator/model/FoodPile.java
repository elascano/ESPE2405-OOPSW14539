
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Zaith Manangón, Dell, DCCO-ESPE
 */
public class FoodPile {
    private Cell position;
    private int PileAmount;
    
    public Food yieldFood(int amount){
        Food food = new Food(amount);
        return food;
    }

    public FoodPile(Cell position, int PileAmount) {
        this.position = position;
        this.PileAmount = PileAmount;
    }

    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @return the PileAmount
     */
    public int getPileAmount() {
        return PileAmount;
    }

    /**
     * @param PileAmount the PileAmount to set
     */
    public void setPileAmount(int PileAmount) {
        this.PileAmount = PileAmount;
    }
    
    
}
