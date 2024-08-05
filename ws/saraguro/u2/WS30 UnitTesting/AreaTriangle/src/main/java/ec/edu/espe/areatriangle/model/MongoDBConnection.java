/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.areatriangle.model;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class MongoDBConnection {

    private static final String URI = "mongodb+srv://saraguro:saraguro@cluster0.5nyjils.mongodb.net/";
    private static final String DATABASE_NAME = "TriangleDB";
    private static final String COLLECTION_NAME = "TriangleAreas";
    
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public MongoDBConnection() {
        mongoClient = MongoClients.create(URI);
        database = mongoClient.getDatabase(DATABASE_NAME);
        collection = database.getCollection(COLLECTION_NAME);
    }

    public void saveTriangleArea(double base, double height, double area) {
        Document document = new Document("base", base)
                .append("height", height)
                .append("area", area);
        collection.insertOne(document);
    }

    public void close() {
        mongoClient.close();
    }
}
