package ec.edu.espe.hw28_composite.model;

/**
 *
 * @author Damian Toscano
 */
public class Teller extends Employee {

    public Teller(String aName) {
        this();
        name = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Teller() {
        title = "Teller";
    }

}
