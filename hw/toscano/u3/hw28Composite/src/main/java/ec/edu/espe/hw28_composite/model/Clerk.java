package ec.edu.espe.hw28_composite.model;

/**
 *
 * @author Damian Toscano
 */
public class Clerk extends Employee {

    public Clerk(String aName) {
        this();
        name = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Clerk() {
        title = "Clerk";
    }

}
