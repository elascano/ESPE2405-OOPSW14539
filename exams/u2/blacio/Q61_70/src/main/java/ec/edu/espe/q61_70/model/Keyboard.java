package ec.edu.espe.q61_70.model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Keyboard {

    private int id;
    private String name;
    private float price;
    private float weight;
    private int amount;
    private double totalPrice;
    private double approximatedWeight;

    public Keyboard(int id, String name, float price, float weight, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.amount = amount;
        this.totalPrice = price * amount; 
        this.approximatedWeight = weight * amount;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard [id=" + getId() + ", name=" + getName() + ", price=" + getPrice() + ", weight=" + getWeight() + "]";
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return the approximatedWeight
     */
    public double getApproximatedWeight() {
        return approximatedWeight;
    }

    /**
     * @param approximatedWeight the approximatedWeight to set
     */
    public void setApproximatedWeight(double approximatedWeight) {
        this.approximatedWeight = approximatedWeight;
    }

}
