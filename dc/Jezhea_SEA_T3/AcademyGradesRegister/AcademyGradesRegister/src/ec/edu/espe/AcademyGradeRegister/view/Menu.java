/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AcademyGradeRegister.view;

/**
 *
 * @author IAEN
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import utils.InfoManager;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean loggedIn = false;
    private static String username = "";
    private static String cargo = "";

    public static void main(String[] args) {
        while (true) {
            showMainMenu();
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    login();
                    break;
                case 2:
                    createUser();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    return;
                case 4:
                    if (cargo.equals("maestro")) {
                        addStudent();
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese 1, 2, 3 o 4.");
            }

            if (loggedIn) {
                if (cargo.equals("maestro")) {
                    showTeacherMenu();
                } else {
                    showStudentMenu();
                }
                int userOption = scanner.nextInt();
                switch (userOption) {
                    case 1:
                        if (cargo.equals("maestro")) {
                            System.out.println("Ver reporte por estudiante");
                        } else {
                            System.out.println("Ver reporte general");
                        }
                        break;
                    case 2:
                        if (cargo.equals("maestro")) {
                            System.out.println("Ver reporte general");
                        } else {
                            System.out.println("Ver reporte por estudiante");
                        }
                        break;
                    case 3:
                        if (cargo.equals("maestro")) {
                            System.out.println("Modificar datos");
                        }
                        break;
                    case 4:
                        if (cargo.equals("maestro")) {
                            addStudent();
                        }
                        break;
                    case 5:
                        System.out.println("Cerrando sesión...");
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                }
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("Bienvenido al sistema de gestión de información de estudiantes:");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Crear usuario");
        System.out.println("3. Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static void showTeacherMenu() {
        System.out.println("Menú principal:");
        System.out.println("1. Ver reporte por estudiante");
        System.out.println("2. Ver reporte general");
        System.out.println("3. Modificar datos");
        System.out.println("4. Añadir estudiante");
        System.out.println("5. Cerrar sesión");
        System.out.print("Ingrese su opción: ");
    }

    private static void showStudentMenu() {
        System.out.println("Menú principal:");
        System.out.println("1. Ver reporte general");
        System.out.println("2. Ver reporte por estudiante");
        System.out.println("3. Cerrar sesión");
        System.out.print("Ingrese su opción: ");
    }

    private static void login() {
        System.out.print("Ingrese su nombre de usuario: ");
        username = scanner.next();
        // Supongamos que aquí consultas el cargo del usuario desde tu sistema
        // Aquí lo simularemos
        if (username.equals("maestro")) {
            cargo = "maestro";
        } else {
            cargo = "otro";
        }
        loggedIn = true;
    }

    private static void createUser() {
        System.out.print("Ingrese el cargo del usuario (maestro/alumno/familiar): ");
        cargo = scanner.next();
        System.out.print("Ingrese el nombre de usuario: ");
        String newUser = scanner.next();
        System.out.print("Ingrese la contraseña: ");
        String newPassword = scanner.next();

        // Guardar el usuario, contraseña y cargo en un archivo JSON
        Gson gson = new Gson();
        User user = new User(newUser, newPassword, cargo);
        String json = gson.toJson(user);
        try (FileWriter writer = new FileWriter("users.json")) {
            writer.write(json);
            System.out.println("Usuario creado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al crear el usuario: " + e.getMessage());
        }
    }
    
    private static void addStudent() {
        System.out.println("Llamando a InfoManager para agregar estudiante...");
        // Llamar al método main de InfoManager
        InfoManager.main(new String[]{});
    }
}

class User {
    private String username;
    private String password;
    private String cargo;

    public User(String username, String password, String cargo) {
        this.username = username;
        this.password = password;
        this.cargo = cargo;
    }
}
