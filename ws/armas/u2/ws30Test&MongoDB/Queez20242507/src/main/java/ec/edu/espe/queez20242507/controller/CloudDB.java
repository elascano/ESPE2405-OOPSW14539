package ec.edu.espe.queez20242507.controller;

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



/**
 *
 * @author Mario Anrrango, A-Byte Wizards, DCCO - ESPE
 */
public class CloudDB {

     private MongoClient mongoClient;
    private MongoDatabase database;

    public CloudDB() {
        try {
            // Crear cliente de MongoDB
            String connectionString = "mongodb+srv://ffalvarado:frank123@databsas.tuxhrit.mongodb.net/CraftStoreDB?retryWrites=true&w=majority";
            ConnectionString connString = new ConnectionString(connectionString);

            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connString)
                    .serverApi(ServerApi.builder().version(ServerApiVersion.V1).build())
                    .build();

            mongoClient = MongoClients.create(settings);
            database = mongoClient.getDatabase("CraftStoreDB");

        } catch (MongoException e) {
            System.err.println("Error initializing MongoDB: " + e.getMessage());
        }
    }

    // Collection access method
    private MongoCollection<Document> getCollection(String collectionName) {
        return database.getCollection(collectionName);
    }

    // Product operations
    public void uploadProductData(Product product) {
        MongoCollection<Document> collection = getCollection("product");

        Document document = new Document("id", product.getId())
                .append("name", product.getName())
                .append("description", product.getDescription())
                .append("quantity", product.getQuantity())
                .append("size", product.getSize())
                .append("price", product.getPrice())
                .append("category", product.getCategory());

        try {
            collection.insertOne(document);
            System.out.println("Product data saved successfully!");
        } catch (MongoException e) {
            System.err.println("Error inserting document: " + e.getMessage());
        }
    }
    }

