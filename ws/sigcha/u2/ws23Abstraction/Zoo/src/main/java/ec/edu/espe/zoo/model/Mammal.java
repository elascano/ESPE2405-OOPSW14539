package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
  * @author Kenned Sigcha,Paradigm Pioneers Squad, DCCO-ESPE
 */

public abstract class Mammal extends Animal {

    public Mammal(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
    }

}