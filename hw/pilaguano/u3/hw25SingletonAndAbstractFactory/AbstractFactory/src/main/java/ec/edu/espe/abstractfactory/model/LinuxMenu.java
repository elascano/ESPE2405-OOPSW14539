package ec.edu.espe.abstractfactory.model;


/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class LinuxMenu extends Menu {
    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}