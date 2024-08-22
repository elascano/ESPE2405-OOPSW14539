package ec.espe.edu.hwabstractfactory.view;

import ec.espe.edu.hwabstractfactory.controller.FormController;
import ec.espe.edu.hwabstractfactory.model.FormModel;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        // Create the model with some fields
        FormModel model = new FormModel();
        model.addField("username", "");
        model.addField("password", "");

        // Choose the platform and create the appropriate factory
        GUIFactory factory = new DesktopFactory(); // Or new MobileFactory();

        // Create the view
        FormView view = new FormView();

        // Create the controller
        FormController controller = new FormController(model, factory, view);

        // Start the process
        controller.processUserInput();
    }
}
