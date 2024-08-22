package ec.edu.espe.composite.model;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class Clerk extends Employee {

    public Clerk(String aName) {
        this();
        name = aName;
    }

    public Clerk() {
        title = "Clerk";
    }

    @Override
    public void stateName() {
        super.stateName();
    }
}

