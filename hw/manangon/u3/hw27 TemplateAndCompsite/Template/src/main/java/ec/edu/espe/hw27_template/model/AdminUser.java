package ec.edu.espe.hw27_template.model;

import java.util.Scanner;

/**
 *
 * @author Zaith Manangón
 */
public class AdminUser extends UserModel {

    @Override
    protected void inputUsername() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Admin username: ");
        username = scanner.nextLine();
    }

    @Override
    protected void validateUser() {
        System.out.println("Validating Admin username: " + username);
        // Add specific validation for Admin if needed
    }
}