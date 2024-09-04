package ec.edu.espe.hw27_template.model;

import java.util.Scanner;

/**
 *
 * @author Damian Toscano
 */
public class GuestUser extends UserModel {

    @Override
    protected void inputUsername() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Guest username: ");
        username = scanner.nextLine();
    }

    @Override
    protected void validateUser() {
        System.out.println("Validating Guest username: " + username);
    }
}
