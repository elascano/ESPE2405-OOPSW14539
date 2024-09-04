
package abstractfactoryexample.ec.edu.espe.model;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class LinuxFactury extends GUIFactory {
    public Button createButton(){
        return (new LinuxButton());
    }
    public Menu createMenu(){
        return (new LinuxMenu());
    }
    
    
//    public LinuxFactury() {
//    }
    
}
