package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class WinMenu extends Menu {
    @Override
    public void paint() {
        System.out.println("I'm a WinMenu: " + caption);
    }
}
