
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Ricardo Lainez JEZHE Association Software Engineers
 */
public class Nest {
    private Cell position;
    private Food[] stockPile;

    public Nest(Cell position, Food[] stockPile) {
        this.position = position;
        this.stockPile = stockPile;
    }

    @Override
    public String toString() {
        return "Nest{" + "position=" + position + ", stockPile=" + stockPile + '}';
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public Food[] getStockPile() {
        return stockPile;
    }

    public void setStockPile(Food[] stockPile) {
        this.stockPile = stockPile;
    }
}
