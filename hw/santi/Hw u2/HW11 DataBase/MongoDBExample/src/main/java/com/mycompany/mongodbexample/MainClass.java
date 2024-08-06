
package com.mycompany.mongodbexample;

/**
 *
 * @author Sjean
 */

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Scanner;

public class MainClass {

    private static MongoCollection<Document> collection;

    public static void main(String[] args) {
        // Reemplaza la cadena de conexión con tu propia cadena de conexión de MongoDB Atlas
        String uri = "mongodb+srv://sjeancarlo:sjeancarlo@cluster0.3ixvnnj.mongodb.net/?appName=Cluster0";
        MongoClient mongoClient = MongoClients.create(uri);

        // Conectarse a la base de datos "Example" y la colección "Movies"
        MongoDatabase database = mongoClient.getDatabase("Example");
        collection = database.getCollection("Movies");

        // Mostrar el menú
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Movie");
            System.out.println("2. Delete Movie");
            System.out.println("3. Find Movie by ID");
            System.out.println("4. View All Movies");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addMovie(scanner);
                    break;
                case 2:
                    deleteMovie(scanner);
                    break;
                case 3:
                    findMovieById(scanner);
                    break;
                case 4:
                    viewAllMovies();
                    break;
                case 5:
                    mongoClient.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addMovie(Scanner scanner) {
        System.out.print("Enter ID (leave empty for automatic ID): ");
        String id = scanner.nextLine();
        ObjectId objectId;
        if (id.isEmpty()) {
            objectId = new ObjectId();
        } else {
            if (id.length() == 24) {
                try {
                    objectId = new ObjectId(id);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid ID format. Generating a new ID.");
                    objectId = new ObjectId();
                }
            } else {
                System.out.println("Invalid ID format. Generating a new ID.");
                objectId = new ObjectId();
            }
        }

        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter director: ");
        String director = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();

        Document movie = new Document("_id", objectId)
                .append("title", title)
                .append("director", director)
                .append("year", year)
                .append("genre", genre);

        collection.insertOne(movie);
        System.out.println("Movie added successfully.");
    }

    private static void deleteMovie(Scanner scanner) {
        System.out.print("Enter movie ID to delete: ");
        String id = scanner.nextLine();

        collection.deleteOne(Filters.eq("_id", new ObjectId(id)));
        System.out.println("Movie deleted successfully.");
    }

    private static void findMovieById(Scanner scanner) {
        System.out.print("Enter movie ID to find: ");
        String id = scanner.nextLine();

        Document movie = collection.find(Filters.eq("_id", new ObjectId(id))).first();
        if (movie != null) {
            System.out.println("Movie found: " + movie.toJson());
        } else {
            System.out.println("Movie not found.");
        }
    }

    private static void viewAllMovies() {
        for (Document movie : collection.find()) {
            System.out.println(movie.toJson());
        }
    }
}
