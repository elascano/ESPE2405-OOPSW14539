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
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.q61_70.model.Keyboard;
import java.util.ArrayList;
import java.util.List;
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

    public static Keyboard findKeyboardById(int id) {
        Keyboard keyboard = null;
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("KeyboardDatabase");
            MongoCollection<Document> collection = database.getCollection("keyboards");

            Document query = new Document("id", id);
            FindIterable<Document> result = collection.find(query);

            Document document = result.first();
            if (document != null) {
                int dbId = document.getInteger("id");
                String name = document.getString("name");
                float price = document.getDouble("price").floatValue();
                float weight = document.getDouble("weight").floatValue();
                int amount = document.getInteger("amount");

                keyboard = new Keyboard(dbId, name, price, weight, amount);
            }
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return keyboard;
    }

    public static void deleteKeyboardById(int id) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("KeyboardDatabase");
            MongoCollection<Document> collection = database.getCollection("keyboards");

            Document query = new Document("id", id);
            collection.deleteOne(query);
            System.out.println("Keyboard deleted successfully!");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    public static List<Keyboard> getAllKeyboards() {
        List<Keyboard> keyboards = new ArrayList<>();
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("KeyboardDatabase");
            MongoCollection<Document> collection = database.getCollection("keyboards");

            FindIterable<Document> result = collection.find();
            for (Document document : result) {
                Keyboard keyboard = new Keyboard(
                        document.getInteger("id"),
                        document.getString("name"),
                        document.getDouble("price").floatValue(),
                        document.getDouble("weight").floatValue(),
                        document.getInteger("amount")
                );
                keyboards.add(keyboard);
            }
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return keyboards;
    }
}
