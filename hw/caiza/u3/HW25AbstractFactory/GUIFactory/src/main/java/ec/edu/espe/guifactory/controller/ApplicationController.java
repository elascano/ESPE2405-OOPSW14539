package ec.edu.espe.guifactory.controller;

import ec.edu.espe.guifactory.model.GUIFactory;
import java.awt.Button;
import java.awt.Menu;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class ApplicationController {
    private GUIFactory factory;

    public ApplicationController() {
        factory = GUIFactory.getFactory();
    }

    public void run() {
        Button button = factory.createButton();
        Menu menu = factory.createMenu();

        button.caption = "Play"; // Set caption
        menu.caption = "File";   // Set caption

        button.paint();
        menu.paint();
    } 
}
