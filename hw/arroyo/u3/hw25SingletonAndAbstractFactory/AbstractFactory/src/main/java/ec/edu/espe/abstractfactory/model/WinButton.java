package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class WinButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}