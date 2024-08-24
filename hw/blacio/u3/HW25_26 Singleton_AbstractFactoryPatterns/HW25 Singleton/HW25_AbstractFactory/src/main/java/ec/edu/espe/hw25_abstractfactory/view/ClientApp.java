package ec.edu.espe.hw25_abstractfactory.view;

import ec.edu.espe.hw25_abstactfactory.model.Button;
import ec.edu.espe.hw25_abstactfactory.model.GUIFactory;


/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory= GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
}
