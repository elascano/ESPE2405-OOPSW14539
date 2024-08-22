package ec.edu.espe.presidentialsystem.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class Manager extends Supervisor{
    public Manager(String aName) {
        super();
        this.name = aName;
        this.title = "Manager";
    }

    @Override
    public void stateName() {
        // Special processing for Manager
        System.out.println("Manager details:");
        super.stateName();
    }    
}
