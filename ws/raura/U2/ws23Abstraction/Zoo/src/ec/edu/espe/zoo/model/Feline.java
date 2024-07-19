package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public abstract class Feline extends Mammal{
    
    public Feline(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
    }
    
    
    
}
