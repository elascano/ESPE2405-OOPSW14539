package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class LinuxMenu extends Menu {
    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}