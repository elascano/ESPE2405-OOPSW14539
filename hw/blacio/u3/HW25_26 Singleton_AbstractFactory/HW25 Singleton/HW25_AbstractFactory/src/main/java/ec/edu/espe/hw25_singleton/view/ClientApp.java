package ec.edu.espe.hw25_singleton.view;

import ec.edu.espe.hw25_singleton.model.Button;
import ec.edu.espe.hw25_singleton.model.GUIFactory;


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
