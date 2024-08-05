package ec.edu.espe.furniture.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.furniture.model.Furniture;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class CloudDB {

    private MongoClient mongoClient;
    private MongoDatabase database;

    public CloudDB() {
        try {
            // Crear cliente de MongoDB
            String connectionString = "mongodb+srv://aaarroyo6:aaarroyo6@cluster0.govonbe.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
            ConnectionString connString = new ConnectionString(connectionString);

            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connString)
                    .serverApi(ServerApi.builder().version(ServerApiVersion.V1).build())
                    .build();

            mongoClient = MongoClients.create(settings);
            database = mongoClient.getDatabase("Furniture");

        } catch (MongoException e) {
            System.err.println("Error initializing MongoDB: " + e.getMessage());
        }
    }

    // Collection access method
    private MongoCollection<Document> getCollection(String collectionName) {
        return database.getCollection(collectionName);
    }

    // Furniture operations
    public void uploadFurnitureData(Furniture furniture) {
        MongoCollection<Document> collection = getCollection("Furniture");

        Document document = new Document("id", furniture.getId())
                .append("name", furniture.getName())
                .append("price", furniture.getPrice())
                .append("quantity", furniture.getQuantity());

        try {
            collection.insertOne(document);
            System.out.println("Furniture data saved successfully!");
        } catch (MongoException e) {
            System.err.println("Error inserting document: " + e.getMessage());
        }
    }

    public boolean furnitureExists(String id) {
        MongoCollection<Document> collection = getCollection("Furniture");

        Document query = new Document("id", id);
        return collection.find(query).first() != null;
    }

    public void updateFurniture(Furniture furniture) {
        MongoCollection<Document> collection = getCollection("Furniture");

        Document query = new Document("id", furniture.getId());
        Document updatedData = new Document("$set", new Document()
                .append("name", furniture.getName())
                .append("price", furniture.getPrice())
                .append("quantity", furniture.getQuantity()));

        try {
            collection.updateOne(query, updatedData);
            System.out.println("Furniture data updated successfully!");
        } catch (MongoException e) {
            System.err.println("Error updating document: " + e.getMessage());
        }
    }

    public List<Document> getAllFurnitures() {
        MongoCollection<Document> collection = getCollection("Furniture");

        List<Document> furnitures = new ArrayList<>();
        try (var cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                furnitures.add(cursor.next());
            }
        } catch (MongoException e) {
            System.err.println("Error fetching documents: " + e.getMessage());
        }
        return furnitures;
    }

    public void deleteFurniture(String id) {
        MongoCollection<Document> collection = getCollection("Furniture");
        Document query = new Document("id", id);

        try {
            DeleteResult result = collection.deleteOne(query);
            if (result.getDeletedCount() > 0) {
                System.out.println("Furniture deleted successfully!");
            } else {
                System.out.println("No Furniture found with the given ID.");
            }
        } catch (MongoException e) {
            System.err.println("Error deleting document: " + e.getMessage());
        }
    }
}
