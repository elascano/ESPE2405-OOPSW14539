
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public abstract class Mammal extends Animal{

    public Mammal(int Id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(Id, bornOnDate, cage, gender, numberOfLegs);
    }

    
    
}
