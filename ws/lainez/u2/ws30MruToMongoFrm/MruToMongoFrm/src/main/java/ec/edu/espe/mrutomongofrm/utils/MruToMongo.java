/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mrutomongofrm.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.mrutomongo.model.ComputeSpeed;
import org.bson.Document;

/**
 *
 * @author WINDOWS
 */
public class MruToMongo {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public MruToMongo() {
        mongoClient = MongoClients.create("mongodb+srv://ricardoandreslainezsuarez:ricardo_1422@ricardolainez.yyg9cp1.mongodb.net/");
        database = mongoClient.getDatabase("ComputeSpeed");
        collection = database.getCollection("mru");
    }

    public void saveSpeedRecord(double distance, double time, double speed) {
        Document document = new Document("distance", distance)
                .append("time", time)
                .append("speed", speed);
        collection.insertOne(document);
    }
}