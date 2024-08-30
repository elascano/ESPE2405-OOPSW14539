package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Leidy Saraguro
 */
public class LinuxMenu extends Menu {
    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}