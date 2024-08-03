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

    public Keyboard(int id, String name, float price, float weight) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
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

    public float computeValue() {
        return this.price * this.weight;
    }

    @Override
    public String toString() {
        return "Keyboard [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + "]";
    }

}
