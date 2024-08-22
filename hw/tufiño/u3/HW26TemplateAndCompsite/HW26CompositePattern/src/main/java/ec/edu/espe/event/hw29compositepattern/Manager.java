
package ec.edu.espe.event.hw29compositepattern;

/**
 *
 * @author Erick
 */
public class Manager extends Supervisior{
    public Manager(String aName){
        this();
        name = aName;
    }
    
    public Manager(){
        super();
        title = "Manager";
    }
    
    public void stateName(){
        super.stateName();
    }
}
