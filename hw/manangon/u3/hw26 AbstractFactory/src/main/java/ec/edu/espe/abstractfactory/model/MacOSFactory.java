
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Zaith Manangón
 */
public class MacOSFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
    
}
