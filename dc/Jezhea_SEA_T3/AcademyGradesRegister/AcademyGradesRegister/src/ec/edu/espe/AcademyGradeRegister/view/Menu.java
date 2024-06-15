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
import com.google.gson.JsonObject;
import static java.lang.System.console;
import utils.InfoManager;
import java.io.Console;
import java.io.FileReader;
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
        String inputUsername = scanner.next();

        // Array para almacenar los nombres de los archivos JSON de los diferentes cargos
        String[] cargos = {"estudiante", "maestro", "familiar"};

        // Variable para indicar si se encontró el usuario
        boolean usuarioEncontrado = false;

        // Iterar sobre cada archivo JSON para buscar el nombre de usuario
        for (String cargo : cargos) {
            String filename = cargo + ".json";
            try (FileReader reader = new FileReader(filename)) {
                Gson gson = new Gson();
                JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
                String savedUsername = jsonObject.get("username").getAsString();
                if (savedUsername.equals(inputUsername)) {
                    System.out.println("Inicio de sesión exitoso.");
                    username = inputUsername;
                    Menu.cargo = cargo;
                    loggedIn = true;
                    usuarioEncontrado = true;
                    break; // Salir del bucle si se encuentra el usuario
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo JSON: " + e.getMessage());
                loggedIn = false;
            }
        }

        // Mostrar mensaje si el usuario no se encuentra en ninguno de los archivos JSON
        if (!usuarioEncontrado) {
            System.out.println("Nombre de usuario incorrecto.");
            loggedIn = false;
        }
    }

    private static Console console = System.console();

    private static void createUser() {
        if (console == null) {
            System.err.println("No se puede obtener la consola, asegúrese de estar ejecutando en una consola interactiva.");
            return;
        }

        System.out.print("Ingrese el cargo del usuario (maestro/alumno/familiar): ");
        String cargo = console.readLine();
        System.out.print("Ingrese el nombre de usuario: ");
        String newUser = console.readLine();
        char[] passwordArray = console.readPassword("Ingrese la contraseña: ");
        String newPassword = new String(passwordArray);

        // Guardar el usuario, contraseña y cargo en un archivo JSON
        Gson gson = new Gson();
        User user = new User(newUser, newPassword, cargo);
        String json = gson.toJson(user);
        String filename = cargo.toLowerCase() + ".json"; // Nombre del archivo según el cargo
        try (FileWriter writer = new FileWriter(filename)) {
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
