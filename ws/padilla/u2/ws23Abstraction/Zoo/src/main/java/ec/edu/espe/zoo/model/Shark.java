package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Marco Padilla
 */
public class Shark extends Fish {

    public Shark(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
    }

    @Override
    public void feed(int food) {
        System.out.println("feeding a shark with " + food + "fish");
    }

}
