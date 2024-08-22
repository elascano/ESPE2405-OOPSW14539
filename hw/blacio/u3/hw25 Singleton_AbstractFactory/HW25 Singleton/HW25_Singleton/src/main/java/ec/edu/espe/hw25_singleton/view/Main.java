package ec.edu.espe.hw25_singleton.view;

import ec.edu.espe.hw25_singleton.controller.UserController;
import ec.edu.espe.hw25_singleton.model.UserModel;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Main {

    public static void main(String[] args) {
        UserModel model = UserModel.getInstance();

        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        controller.updateUsername();
        controller.displayUsername();
    }
}
