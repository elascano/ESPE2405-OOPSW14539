package ec.edu.espe.hw25_singleton.view;

import ec.edu.espe.hw25_singleton.model.Button;
import ec.edu.espe.hw25_singleton.model.GUIFactory;


/**
 *
 * @author Damian Toscano
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory= GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
}
