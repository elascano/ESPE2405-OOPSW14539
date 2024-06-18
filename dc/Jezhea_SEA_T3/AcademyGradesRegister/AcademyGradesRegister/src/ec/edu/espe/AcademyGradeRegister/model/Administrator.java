package ec.edu.espe.AcademyGradeRegister.model;

import java.util.Map;

/**
 * Clase que representa a un administrador en el sistema.
 * 
 * @author Ricardo Lainez JEZHE asociación de ingenieros de software - DCCO ESPE
 */
public class Administrator {
    private String adminID;
    private String firstName;
    private String lastName;
    private String email;

    // Constructor
    public Administrator(String adminID, String firstName, String lastName, String email) {
        this.adminID = adminID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getters y Setters
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para mostrar la información del administrador
    @Override
    public String toString() {
        return "Admin ID: " + adminID + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email;
    }
}
