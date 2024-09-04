package ec.edu.espe.hw25_singleton.model;

/**
 *
 * @author Damian Toscano
 */
public class LinuxButton extends Button {

    public void paint() {
        System.out.println("I'm a LinuxButton:" + caption);
    }
}
