
package abstractfactoryexample.ec.edu.espe.model;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class WinFactory extends GUIFactory {

    public Button createButton(){
        return (new WinButton());
    }
    public Menu createMenu(){
        return (new WinMenu());
    }
//    public WinFactory() {
//    }
    
}
