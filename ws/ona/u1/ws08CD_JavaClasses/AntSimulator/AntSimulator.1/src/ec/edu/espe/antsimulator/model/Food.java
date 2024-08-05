
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Leydi Oña, Lenovo, DCCO-ESPE
 */
public class Food {
    private int amount;

    public Food(int amount){
        this.amount= amount*10;
    }
    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Food{" + "amount=" + amount + '}';
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
