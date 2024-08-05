/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;
/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.model.Keyboard;
import org.bson.Document;

public class MongoDbConnection {
    private static final String DATABASE_NAME = "KeyboardStore";
    private static final String COLLECTION_NAME = "keyboards";
    private static final String CONNECTION_URI = "mongodb+srv://rauraandrea:rauraandrea@cluster0.izygxtz.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"; // Reemplaza con tu URI de conexión
    private MongoDatabase database;

    public MongoDbConnection() {
        MongoClient mongoClient = MongoClients.create(CONNECTION_URI);
        this.database = mongoClient.getDatabase(DATABASE_NAME);
    }

    public MongoCollection<Document> getCollection() {
        return database.getCollection(COLLECTION_NAME);
    }

    public void insertKeyboard(Keyboard keyboard) {
        MongoCollection<Document> collection = getCollection();
        Document document = new Document("id", keyboard.getId())
                .append("name", keyboard.getName())
                .append("amount", keyboard.getAmount())
                .append("price", keyboard.getPrice())
                .append("totalPrice", keyboard.getTotalPrice());
        collection.insertOne(document);
    }

    public MongoDatabase getDatabase() {
        return database;
    }
}