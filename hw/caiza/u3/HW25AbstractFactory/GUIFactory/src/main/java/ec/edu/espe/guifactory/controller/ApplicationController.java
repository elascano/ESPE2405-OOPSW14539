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

    public void run() { // Asegúrate de que el tipo de retorno sea void
        Button button = factory.createButton();
        Menu menu = factory.createMenu();

        button.caption = "Play";
        menu.caption = "File";

        button.paint(); // Simula el proceso de creación del botón.
        menu.paint();   // Simula el proceso de creación del menú.
    }  
}
