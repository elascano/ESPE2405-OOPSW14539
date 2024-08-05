
package ec.edu.espe.bookmongodb.model;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
 
/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */

public class DatabaseConnection {

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    public static MongoDatabase getConnection() {
        if (mongoClient == null) {
            String connectionString = "mongodb+srv://saraguro:saraguro@clusterO.5nyjils.mongodb.net/";
            mongoClient = MongoClients.create(connectionString);
            database = mongoClient.getDatabase("oop"); 
        }
        return database;
    }
}
