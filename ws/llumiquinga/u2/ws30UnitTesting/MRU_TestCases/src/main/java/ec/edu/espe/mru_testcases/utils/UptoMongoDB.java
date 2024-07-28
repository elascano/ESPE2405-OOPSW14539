/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mru_testcases.utils;
import ec.edu.espe.mru_testcases.model.*;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class UptoMongoDB {
 private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public UptoMongoDB(String uri, String dbName, String collectionName) {
        mongoClient = MongoClients.create(uri);
        database = mongoClient.getDatabase(dbName);
        collection = database.getCollection(collectionName);
    }

    public void insertData(Velocity velocity, Time time, Distance distance) {
        Document doc = new Document("velocity", velocity.getVelocity())
                .append("time", time.getTime())
                .append("distance", distance.getDistance());
        collection.insertOne(doc);
    }

    public void close() {
        mongoClient.close();
    }

    public static void uploadData(String uri, String dbName, String collectionName, Velocity velocity, Time time, Distance distance) {
        UptoMongoDB mongoDB = new UptoMongoDB(uri, dbName, collectionName);
        mongoDB.insertData(velocity, time, distance);
        mongoDB.close();
    }
}
