package ec.edu.espe.hw25_singleton.controller;

import ec.edu.espe.hw25_singleton.model.UserModel;
import ec.edu.espe.hw25_singleton.view.UserView;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class UserController {

    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void updateUsername() {
        String username = view.getInput();
        model.setUsername(username);
    }

    public void displayUsername() {
        view.displayUsername(model.getUsername());
    }
}
