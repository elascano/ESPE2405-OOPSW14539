package ec.edu.espe.hw25_abstactfactory.model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class WinButton extends Button {

    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
