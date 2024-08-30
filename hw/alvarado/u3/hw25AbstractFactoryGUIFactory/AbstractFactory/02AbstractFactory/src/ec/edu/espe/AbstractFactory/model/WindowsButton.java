package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Alvarado Grefa Frank Byte
 */
public class WindowsButton extends Button {

    WindowsButton() {
    }

    @Override
    public void paint() {
        System.out.println("I'm a WindowsButton:" + caption);
    }

}
