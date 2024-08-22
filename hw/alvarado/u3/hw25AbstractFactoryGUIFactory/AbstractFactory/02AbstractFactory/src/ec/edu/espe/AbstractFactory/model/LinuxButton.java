package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Alvarado Grefa Frank Byte
 */
public class LinuxButton extends Button {

    LinuxButton() {

    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton:" + caption);
    }

}
