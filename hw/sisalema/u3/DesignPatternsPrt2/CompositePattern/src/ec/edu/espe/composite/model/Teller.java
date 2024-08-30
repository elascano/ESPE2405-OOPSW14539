package ec.edu.espe.composite.model;

/**
 *
 * @author Yostin Sisalema,Code Master,DCCO-ESPE
 */
public class Teller extends Employee {

    public Teller(String aName) {
        this();
        name = aName;
    }

    @Override
    public void stateName() {
        super.stateName();
    }

    public Teller() {
        title = "Teller";
    }
}
