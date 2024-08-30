package ec.edu.espe.hw28_composite.model;

/**
 *
 * @author Damian Toscano
 */
public class President extends Supervisor {

    private static President president = new President();
    private President(String aName) {
        this();
        name = aName;
    }

    private President() {
        super();
        title = "President";
    }

    public void stateName() {
        // do processing special to president naming
        super.stateName();
    }

    public static President getPresident(String aName){
        president.name = aName;
        return President.president;
    }
}
