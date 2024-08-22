package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Alvarado Grefa Frank Byte
 */
public class WindowsFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return (new WindowsButton());
    }

    @Override
    public Menu createMenu() {
        return (new WindowsMenu());
    }

}
