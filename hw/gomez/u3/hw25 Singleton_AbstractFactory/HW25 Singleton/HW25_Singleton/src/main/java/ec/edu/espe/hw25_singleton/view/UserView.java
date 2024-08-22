package ec.edu.espe.hw25_singleton.view;

import java.util.Scanner;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class UserView {

    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        System.out.print("Enter your username: ");
        return scanner.nextLine();
    }

    public void displayUsername(String username) {
        System.out.println("Your username is: " + username);
    }
}
