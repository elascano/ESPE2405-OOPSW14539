package ec.edu.espe.hw25_singleton.view;

import ec.edu.espe.hw25_singleton.model.Button;
import ec.edu.espe.hw25_singleton.model.Menu;

/**
 *
 * @author Damian Toscano
 */
public class GUIView {

    public void display(Button button, Menu menu) {
        button.paint();
        menu.paint();
    }
}
