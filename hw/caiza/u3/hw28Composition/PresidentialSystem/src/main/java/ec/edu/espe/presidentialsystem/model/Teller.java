package ec.edu.espe.presidentialsystem.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class Teller extends Employee {
    public Teller(String aName) {
        super();
        this.name = aName;
        this.title = "Teller";
    }

    @Override
    public void stateName() {
        super.stateName();
    }    
}
