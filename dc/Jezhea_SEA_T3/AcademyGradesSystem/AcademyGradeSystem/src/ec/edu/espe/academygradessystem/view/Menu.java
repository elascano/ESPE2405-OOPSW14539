/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradessystem.view;

/**
 *
 * @author IAEN
 */
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<User> users;
    private static final String USER_FILE = "users.dat";
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
        users = loadUsers();
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    if (loginUser()) {
                        AcademyGradesSystem.startAdminSystem();
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void registerUser() {
    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    Console console = System.console();
    String password;

    if (console == null) {
        System.out.print("Enter password: ");
        password = scanner.nextLine();
    } else {
        password = new String(console.readPassword("Enter password: "));
    }

    try {
        User newUser = new User(username, password);
        users.add(newUser);
        saveUsers();
        System.out.println("User registered successfully.");
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        System.out.println("Registration failed. Please try again with a valid password.");
    }
}


    private boolean loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        Console console = System.console();
        String password;
        if (console == null) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } else {
            password = new String(console.readPassword("Enter password: "));
        }
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                return true;
            }
        }
        System.out.println("Invalid username or password.");
        return false;
    }

    private List<User> loadUsers() {
        // Implement the method to load users from the file
        return new ArrayList<>();
    }

    private void saveUsers() {
        // Implement the method to save users to the file
    }
}

