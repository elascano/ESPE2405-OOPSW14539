/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.javawithmongodb.view;

import ec.edu.espe.javawithmongodb.controller.MongoDBManager;
import ec.edu.espe.javawithmongodb.model.Student;
import java.util.Scanner;

/**
 *
 * @author Joffre
 */
public class SaveInMongoDBSystem {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
    
        MongoDBManager manager = new MongoDBManager();

      
       Scanner scanner = new Scanner(System.in);

// Capturar los datos del estudiante por teclado
System.out.println("Ingrese el ID del estudiante:");
String id = scanner.nextLine();

System.out.println("Ingrese el nombre del estudiante:");
String name = scanner.nextLine();

System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD) del estudiante:");
String bornOnDate = scanner.nextLine();

System.out.println("Ingrese la carrera del estudiante:");
String major = scanner.nextLine();

double gpa = 0.0;
boolean validInput = false;
while (!validInput) {
    try {
        System.out.println("Ingrese el GPA del estudiante:");
        gpa = Double.parseDouble(scanner.nextLine());
        validInput = true;
    } catch (NumberFormatException e) {
        System.out.println("Formato de GPA inválido. Ingrese un número decimal.");
    }
}

Student student = new Student(id, name, bornOnDate, major, gpa);

manager.insertStudent(student);


manager.close();
scanner.close();
    }
}
