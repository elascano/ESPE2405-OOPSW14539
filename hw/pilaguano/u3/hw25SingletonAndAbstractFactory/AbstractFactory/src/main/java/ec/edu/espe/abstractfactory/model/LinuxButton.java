package ec.edu.espe.abstractfactory.model;


/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */


public class LinuxButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}