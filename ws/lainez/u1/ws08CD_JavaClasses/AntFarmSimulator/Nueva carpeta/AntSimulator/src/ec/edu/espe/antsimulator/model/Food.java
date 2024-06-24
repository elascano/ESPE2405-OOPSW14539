
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Ricardo Lainez JEZHE Association Software Engineers
 */
public class Food {
    private int amount;

    public Food(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Food{" + "amount=" + amount + '}';
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
