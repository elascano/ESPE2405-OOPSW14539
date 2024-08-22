package ec.edu.espe.singleton.model;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */

public class USTax {
    private static USTax instance;
    private float taxRate;

    private USTax() {
        this.taxRate = 15; 
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    public float calculateTotal(float basePrice) {
        return basePrice + (basePrice * taxRate / 100);
    }
}

