package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Jerson Llumiquinga M, JEZHE SEA
 */

public class Tiger extends Feline {

    public Tiger(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
    }

    @Override
    public void feed(int food) {
        System.out.println("Feeding a tiger with" + food + "meat");
    }

}
