package ec.edu.espe.mongodb_addstudents.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class MongoDBConnection {
     private static MongoDatabase mongodb = null;

    public static MongoDatabase getDatabase() {
        if (mongodb == null) {
            String uri = "mongodb+srv://JersonLlM:jersonllm23@cluster0.yjwpgvg.mongodb.net/students?retryWrites=true&w=majority";
            String dbName = "students";  // Nombre de tu base de datos
            try {
                MongoClient mongoClient = MongoClients.create(uri);
                mongodb = mongoClient.getDatabase(dbName);
                System.out.println("Connected successfully to the database");
            } catch (Exception e) {
                System.err.println("Error connecting to the database: " + e.getMessage());
            }
        }
        return mongodb;
    }
}
