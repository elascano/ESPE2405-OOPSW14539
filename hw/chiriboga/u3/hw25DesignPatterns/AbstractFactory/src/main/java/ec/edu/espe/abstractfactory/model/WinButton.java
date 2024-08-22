package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class WinButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
