
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Erick
 */
public class LinuxButton extends Button{

    public LinuxButton() {
        super("Linux button");
    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
    
}
