package ec.edu.espe.hw25_singleton.model;

/**
 *
 * @author Damian Toscano
 */
public class LinuxFactory extends GUIFactory {

    public Button createButton() {
        return new LinuxButton();
    }

    public Menu createMenu() {
        return new LinuxMenu();
    }
}
