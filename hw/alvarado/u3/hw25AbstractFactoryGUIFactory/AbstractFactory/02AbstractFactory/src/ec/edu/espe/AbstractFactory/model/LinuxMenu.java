package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Alvarado Grefa Frank Byte
 */
public class LinuxMenu extends Menu {

    LinuxMenu() {

    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu" + caption);
    }

}