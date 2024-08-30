package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Alvarado Grefa Frank Byte
 */
public class WindowsMenu extends Menu {

    public WindowsMenu() {
    }

    @Override
    public void paint() {
        System.out.println("I'm a WindowsMenu:" + caption);
    }

}
