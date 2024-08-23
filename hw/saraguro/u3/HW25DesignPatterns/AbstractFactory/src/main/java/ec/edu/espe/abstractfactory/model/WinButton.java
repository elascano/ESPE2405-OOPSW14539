package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Leidy Saraguro
 */
public class WinButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
