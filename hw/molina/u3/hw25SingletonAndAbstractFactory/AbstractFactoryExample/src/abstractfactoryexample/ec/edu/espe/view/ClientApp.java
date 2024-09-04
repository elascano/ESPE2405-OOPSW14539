
package abstractfactoryexample.ec.edu.espe.view;

import abstractfactoryexample.ec.edu.espe.model.GUIFactory;
import abstractfactoryexample.ec.edu.espe.model.*;
/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class ClientApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
    
}
