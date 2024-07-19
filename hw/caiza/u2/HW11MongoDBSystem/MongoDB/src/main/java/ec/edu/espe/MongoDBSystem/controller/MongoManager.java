/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MongoDBSystem.controller;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.MongoDBSystem.model.Students;
import org.bson.Document;
import org.bson.types.ObjectId;
/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class MongoManager {
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> collection;

    public MongoManager(String uri, String dbName, String collectionName) {
        MongoClientURI clientURI = new MongoClientURI(uri);
        mongoClient = new MongoClient(clientURI);
        database = mongoClient.getDatabase(dbName);
        collection = database.getCollection(collectionName);
    }

    public void insertStudent(Students student) {
        Document document = new Document("_id", new ObjectId())
                .append("id", student.getId())
                .append("name", student.getName())
                .append("bornOnDate", student.getBornOnDate())
                .append("average", student.getAverage())
                .append("male", student.isMale())
                .append("siblings", student.getSiblings());
        
        collection.insertOne(document);
    }

    public void close() {
        mongoClient.close();
    }
}
