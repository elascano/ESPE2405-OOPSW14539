package ec.edu.espe.abstractfactory.model;


/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class WinButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
