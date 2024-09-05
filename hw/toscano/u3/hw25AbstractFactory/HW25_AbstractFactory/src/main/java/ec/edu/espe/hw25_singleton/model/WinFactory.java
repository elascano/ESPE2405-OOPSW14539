package ec.edu.espe.hw25_singleton.model;

/**
 *
 * @author Damian Toscano
 */
public class WinFactory extends GUIFactory {

    public Button createButton() {
        return new WinButton();
    }

    public Menu createMenu() {
        return new WinMenu();
    }
}
