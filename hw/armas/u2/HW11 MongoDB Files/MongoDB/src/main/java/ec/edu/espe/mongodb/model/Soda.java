

package ec.edu.espe.mongodb.model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Soda {
    private String name;
    private String brand;
    private String flavor;
    private double sugarContent; // on grams
    private int carbonationLevel; // 0 (no gas) a 10 (very fizzy)

    @Override
    public String toString() {
          return "Soda{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", flavor='" + flavor + '\'' +
                ", sugarContent=" + sugarContent +
                ", carbonationLevel=" + carbonationLevel +
                '}';
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * @param flavor the flavor to set
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * @return the sugarContent
     */
    public double getSugarContent() {
        return sugarContent;
    }

    /**
     * @param sugarContent the sugarContent to set
     */
    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    /**
     * @return the carbonationLevel
     */
    public int getCarbonationLevel() {
        return carbonationLevel;
    }

    /**
     * @param carbonationLevel the carbonationLevel to set
     */
    public void setCarbonationLevel(int carbonationLevel) {
        this.carbonationLevel = carbonationLevel;
    }
}

