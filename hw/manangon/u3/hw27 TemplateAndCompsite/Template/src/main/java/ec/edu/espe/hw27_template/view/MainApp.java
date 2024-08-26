package ec.edu.espe.hw27_template.view;

import ec.edu.espe.hw27_template.controller.UserController;
import ec.edu.espe.hw27_template.model.AdminUser;
import ec.edu.espe.hw27_template.model.GuestUser;
import ec.edu.espe.hw27_template.model.UserModel;
import java.util.Scanner;

/**
 *
 * @author Zaith Manangón
 */
public class MainApp {

    public static void main(String[] args) {

        UserModel model = null;
        UserView view = new UserView();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select user type: ");
        System.out.println("1. Admin");
        System.out.println("2. Guest");
        int choice = scanner.nextInt();

        if (choice == 1) {
            model = new AdminUser();
        } else if (choice == 2) {
            model = new GuestUser();
        } else {
            System.out.println("Invalid choice!");
            System.exit(0);
        }

        UserController controller = new UserController(model, view);
        controller.processAndDisplayUser();
    }
}
