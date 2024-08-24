package ec.edu.espe.hw28_composite.model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
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
