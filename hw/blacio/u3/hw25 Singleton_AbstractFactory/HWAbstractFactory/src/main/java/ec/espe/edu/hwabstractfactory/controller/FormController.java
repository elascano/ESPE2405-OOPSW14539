package ec.espe.edu.hwabstractfactory.controller;

import ec.espe.edu.hwabstractfactory.model.FormModel;
import ec.espe.edu.hwabstractfactory.view.Button;
import ec.espe.edu.hwabstractfactory.view.FormView;
import ec.espe.edu.hwabstractfactory.view.GUIFactory;
import java.util.Map;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class FormController {

    private FormModel model;
    private GUIFactory factory;
    private FormView view;

    public FormController(FormModel model, GUIFactory factory, FormView view) {
        this.model = model;
        this.factory = factory;
        this.view = view;
    }

    public void processUserInput() {
        // Render and get user input for each field
        for (String fieldName : model.getAllFields().keySet()) {
            view.renderTextField(fieldName);
            String inputValue = view.getInput();
            model.updateField(fieldName, inputValue);
        }

        Button button = factory.createButton();
        button.render();

        for (Map.Entry<String, String> entry : model.getAllFields().entrySet()) {
            view.displayFieldValue(entry.getKey(), entry.getValue());
        }
    }
}
