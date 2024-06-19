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
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.ArrayList;


public class Menu {

    private List<User> users;
    private static final String USER_FILE = "users.json";
    private Scanner scanner;
    private Gson gson;

    public Menu() {
        scanner = new Scanner(System.in);
        gson = new Gson();
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
        users.add(new User(username, password));
        saveUsers();
        System.out.println("User registered successfully.");
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
        try (FileReader reader = new FileReader(USER_FILE)) {
            Type userListType = new TypeToken<List<User>>() {}.getType();
            List<User> users = gson.fromJson(reader, userListType);
            return users != null ? users : new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Could not load users: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    private void saveUsers() {
        try (FileWriter writer = new FileWriter(USER_FILE)) {
            gson.toJson(users, writer);
        } catch (IOException e) {
            System.out.println("Could not save users: " + e.getMessage());
        }
    }
}

