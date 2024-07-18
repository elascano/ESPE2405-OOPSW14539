package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Monkey extends Primate{

    public Monkey(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
    }

    @Override
    public void feed(int food) {
        System.out.println("feeding a monkey with" + food + "fruits");    
    }
       
}
