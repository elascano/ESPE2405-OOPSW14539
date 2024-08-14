package ec.edu.espe.fisicaunittest.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;


public class SaveManager {
    private MongoCollection<Document> mongoCollection;
    public static MongoDatabase mongodb = null;

    public MongoDatabase connectionDataBase() {
        if (mongodb == null) {
            String uri = "mongodb+srv://pilaguano:pilaguano@cluster0.9goxw5i.mongodb.net/";
            String db = "Fisica";
            try {
                MongoClient mongoClient = MongoClients.create(uri);
                SaveManager.mongodb = mongoClient.getDatabase(db);
                System.out.println("Connected successfully to database");
            } catch (Exception e) {
                System.err.println("Error connecting to database: " + e.getMessage());
            }
        }
        return SaveManager.mongodb;
    }

    public void save(Animal animal) {
        MongoDatabase database = connectionDataBase();
        MongoCollection<Document> collection = database.getCollection("animals");
        
        Document doc = new Document("id", animal.getId())
                .append("description", animal.getDescription())
                .append("date", animal.getDate())
                .append("gender", animal.getGender())
                .append("cage", animal.getCage())
                .append("numberOfBornes", animal.getNumberOfBones())
                .append("isVertebrate", animal.getIsVertebrate())
                .append("foods", animal.getFoods());
        
        collection.insertOne(doc);
        System.out.println("Animal guardado en MongoDB");
    }
}
