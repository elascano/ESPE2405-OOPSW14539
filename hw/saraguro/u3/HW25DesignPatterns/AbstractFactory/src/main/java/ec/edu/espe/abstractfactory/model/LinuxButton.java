package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Leidy Saraguro
 */
public class LinuxButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}