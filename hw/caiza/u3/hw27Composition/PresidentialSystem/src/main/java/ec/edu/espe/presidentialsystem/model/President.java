package ec.edu.espe.presidentialsystem.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class President extends Supervisor{
    private static President president;

    private President() {
        super();
        this.title = "President";
    }

    public static President getPresident(String aName) {
        if (president == null) {
            president = new President();
        }
        president.setName(aName);
        return president;
    }

    @Override
    public void stateName() {
        // Special processing for President
        System.out.println("Presidential details:");
        super.stateName();
    }    
}
