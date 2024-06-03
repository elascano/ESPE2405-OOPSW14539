
package ec.edu.espe.airlinereservationsystem.model;

import enums.BaggageType;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Baggage {
    private BaggageType baggageType;
    private double weight;

    public Baggage(BaggageType baggageType, double weight) {
        this.baggageType = baggageType;
        this.weight = weight;
    }
    
    /**
     * @return the baggageType
     */
    public BaggageType getBaggageType() {
        return baggageType;
    }

    /**
     * @param baggageType the baggageType to set
     */
    public void setBaggageType(BaggageType baggageType) {
        this.baggageType = baggageType;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
