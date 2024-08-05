package espe.edu.es.mongoDB.view;

import espe.edu.es.mongoDB.modell.Car;
import espe.edu.es.mongoDB.util.Conexion;
import org.bson.Document;

import java.util.Scanner;
public class CarView {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter car ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car color: ");
        String color = scanner.nextLine();
        System.out.print("Enter sale date (MM/DD/YYYY): ");
        String saleDate = scanner.nextLine();

        
        Car car = new Car(id, model, color, saleDate);

        
        Conexion conexion = new Conexion();
        conexion.crearConexion(); // Conectar a la base de datos

        
        Document carDoc = new Document() ;
        carDoc.append("id", car.getId())
                .append("model", car.getModel())
                .append("color", car.getColor())
                .append("saleDate", car.getSaleDate());

        try {
            conexion.getDataB().getCollection("cars").insertOne(carDoc);
            System.out.println("Car details saved successfully to MongoDB.");
        } catch (Exception e) {
            System.out.println("Error saving car details to MongoDB: " + e.getMessage());
        } finally {
            conexion.getMongo().close(); // Cerrar la conexión a MongoDB
        }

        scanner.close();
    }
}
