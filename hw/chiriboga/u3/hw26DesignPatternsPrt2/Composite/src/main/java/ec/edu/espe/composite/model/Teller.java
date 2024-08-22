package ec.edu.espe.composite.model;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */

public class Teller extends Employee {

    public Teller(String aName) {
        this();
        name = aName;
    }

    public Teller() {
        title = "Teller";
    }

    @Override
    public void stateName() {
        super.stateName();
    }
}
