
package ec.edu.espe.studentmanagement.controller;

/**
 *
 * @author Adrian Padilla
 */
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private static final String CONNECTION_STRING = "mongodb+srv://mapadilla12:82410Loveadrian.@adrianpadilla.b8xh14p.mongodb.net/";
    private static MongoClient mongoClient;
    private static MongoDatabase database;

    public static void connect() {
        mongoClient = MongoClients.create(CONNECTION_STRING);
        database = mongoClient.getDatabase("students_db"); // Cambia "students_db" por el nombre de tu base de datos
    }

    public static MongoDatabase getDatabase() {
        return database;
    }
}