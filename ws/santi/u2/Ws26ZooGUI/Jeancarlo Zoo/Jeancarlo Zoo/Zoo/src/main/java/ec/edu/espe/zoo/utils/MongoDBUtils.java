package ec.edu.espe.zoo.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.zoo.model.Animal;
import org.bson.Document;

import java.util.List;

public class MongoDBUtils {

    private static MongoClient createMongoClient() {
        String connectionString = "mongodb+srv://sjeancarlo:sjeancarlo@cluster0.3ixvnnj.mongodb.net/?appName=Cluster0";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        return MongoClients.create(settings);
    }

    public static void uploadAnimalData(Animal animal) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("ZooDatabase");

            saveAnimalToDatabase(animal, database);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void saveAnimalToDatabase(Animal animal, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("animals");

        Document animalDocument = new Document("id", animal.getId())
                .append("description", animal.getDescription())
                .append("bornOnDate", animal.getDate())
                .append("gender", animal.getGender())
                .append("cage", animal.getCage())
                .append("vertebrate", animal.isIsVertebrate())
                .append("numberOfBones", animal.getNumberOfBones())
                .append("food", animal.getFoods());

        try {
            collection.insertOne(animalDocument);
            System.out.println("Animal data saved successfully!");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }
}