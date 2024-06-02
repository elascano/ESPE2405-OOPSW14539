
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Nest {
    private Cell position;
    private Food stockpile[];

    public Nest(Cell position, Food[] stockpile) {
        this.position = position;
        this.stockpile = stockpile;
    }

    @Override
    public String toString() {
        return "Nest{" + "position=" + position + ", stockpile=" + stockpile + '}';
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
     * @return the stockpile
     */
    public Food[] getStockpile() {
        return stockpile;
    }

    /**
     * @param stockpile the stockpile to set
     */
    public void setStockpile(Food[] stockpile) {
        this.stockpile = stockpile;
    }
    
    
}
