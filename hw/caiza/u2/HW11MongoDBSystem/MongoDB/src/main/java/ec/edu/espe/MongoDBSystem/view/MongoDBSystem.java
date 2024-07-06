/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MongoDBSystem.view;
import ec.edu.espe.MongoDBSystem.controller.MongoManager;
import ec.edu.espe.MongoDBSystem.model.Students;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class MongoDBSystem {
    public static void main(String[] args) {
        String uri = "mongodb+srv://miguelAngel:Migue1234@cluster0.gpze6hv.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        String dbName = "oop";
        String collectionName = "Student List";

        MongoManager controller = new MongoManager(uri, dbName, collectionName);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter birth date (yyyy-mm-dd): ");
        String bornOnDateStr = scanner.nextLine();
        Date bornOnDate = java.sql.Date.valueOf(bornOnDateStr);

        System.out.print("Enter average: ");
        double average = scanner.nextDouble();

        System.out.print("Enter gender (true for male, false for female): ");
        boolean male = scanner.nextBoolean();

        System.out.print("Enter number of siblings: ");
        int siblings = scanner.nextInt();

        Students student = new Students(
                id,
                name,
                bornOnDate,
                average,
                male,
                siblings
        );

        controller.insertStudent(student);
        controller.close();

        scanner.close();  
    }
}
