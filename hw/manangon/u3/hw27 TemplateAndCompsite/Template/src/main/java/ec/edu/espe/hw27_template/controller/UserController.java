package ec.edu.espe.hw27_template.controller;

import ec.edu.espe.hw27_template.model.UserModel;
import ec.edu.espe.hw27_template.view.UserView;

/**
 *
 * @author Zaith Manangón
 */
public class UserController {

    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void processAndDisplayUser() {
        model.processUser();
        view.displayUsername(model.getUsername());
    }
}
