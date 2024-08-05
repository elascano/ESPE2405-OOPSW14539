package ec.edu.espe.calculatedistance.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Alfonso Arroyo
 */

public class DistanciaController {
    private final MongoClient mongoClient;
    private final MongoDatabase database;
    private final MongoCollection<Document> collection;
    
    public DistanciaController() {
        this.mongoClient = MongoClients.create("mongodb+srv://aaarroyo6:aaarroyo6@cluster0.govonbe.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
        this.database = mongoClient.getDatabase("mydatabase");
        this.collection = database.getCollection("distance");
    }


    public void guardarDistancia(double speed, double time, double distance) {
        Document document = new Document()
            .append("speed", speed)
            .append("time", time)
            .append("distance", distance);
        collection.insertOne(document);
    }

    public void close() {
        mongoClient.close();
    }
}
