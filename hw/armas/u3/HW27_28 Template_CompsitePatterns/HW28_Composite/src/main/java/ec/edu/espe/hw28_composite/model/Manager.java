package ec.edu.espe.hw28_composite.model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Manager extends Supervisor {

    public Manager(String aName) {
        this();
        name = aName;
    }

    public Manager() {
        super();
        title = "Manager";
    }

    public void stateName() {
        // do processing special to manager naming
        super.stateName();
    }
}
