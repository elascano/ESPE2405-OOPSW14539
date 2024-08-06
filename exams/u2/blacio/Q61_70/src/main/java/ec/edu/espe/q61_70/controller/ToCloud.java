package ec.edu.espe.q61_70.controller;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ToCloud {

    private static MongoClient createMongoClient() {
        String connectionString = "mongodb+srv://SrJCBM:OOP14539ODS@firstdb.gtv30gi.mongodb.net/?appName=FirstDB";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        return MongoClients.create(settings);
    }

    public static void uploadKeyboardData(int id, String name, double price, double weight, int amount, double totalPrice, double approximatedWeight) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("KeyboardDatabase");

            saveKeyboardToDatabase(id, name, price, weight, amount, totalPrice, approximatedWeight, database);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void saveKeyboardToDatabase(int id, String name, double price, double weight, int amount, double totalPrice, double approximatedWeight, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("keyboards");

        Document keyboardDocument = new Document("id", id)
                .append("name", name)
                .append("price", price)
                .append("weight", weight)
                .append("amount", amount)
                .append("totalPrice", totalPrice)
                .append("approximatedWeight", approximatedWeight);

        try {
            collection.insertOne(keyboardDocument);
            System.out.println("Keyboard data saved successfully!");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    public static Document findKeyboardById(int id) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("KeyboardDatabase");
            MongoCollection<Document> collection = database.getCollection("keyboards");

            Document query = new Document("id", id);
            return collection.find(query).first();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
