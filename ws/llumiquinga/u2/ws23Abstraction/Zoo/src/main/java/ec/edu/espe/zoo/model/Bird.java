package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Jerson Llumiquinga M, JEZHE SEA
 */
public abstract class Bird extends Animal{
    
    public Bird(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
    }
    
}
