package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Jerson Llumiquinga M, JEZHE SEA
 */

public class Lion extends Feline {

    public Lion(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
    }

    @Override
    public void feed(int food) {
        System.out.println("Feeding a lion with " + food + " pounds of meat");
    }

    public void feed(int food, String type) {
        System.out.println("Feeding a lion with " + food + " " + type);
    }
}
