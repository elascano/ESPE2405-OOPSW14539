/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q61_70.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.q61.model.Houses;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author  Yostin Sisalema, Code Master, DCCO-ESPE
 */
public class SaveMongoDb {
   private MongoCollection<Document> mongoCollection;
    public static MongoDatabase mongodb = null;
    private List<Houses> singers = new ArrayList<>();;

    public MongoDatabase connectionDataBase() {
        if (mongodb == null) {
            String uri = "mongodb+srv://yasisalema:yasisalema@cluster0.51fic9g.mongodb.net/Singer";
            String db = "Singer";
            try {
                MongoClient mongoClient = MongoClients.create(uri);
                SaveMongoDb.mongodb = mongoClient.getDatabase(db);
                System.out.println("Connected successfully to database");
            } catch (Exception e) {
                System.err.println("Error connecting to database: " + e.getMessage());
            }
        }
        return SaveMongoDb.mongodb;
    }
    public void saveSinger(Houses singer) {
        MongoDatabase database = connectionDataBase();
        MongoCollection<Document> collection = database.getCollection("singers");

        Document singerDoc = new Document("_id", new ObjectId())
                  .append("id", singer.getId())
                  .append("name", singer.getName())
                  .append("song", singer.getSong());
        collection.insertOne(singerDoc);
        System.out.println("Cantante guardado en MongoDB");
    }
    public void updateSinger(int id, Houses updatedSinger) {
        MongoDatabase database = connectionDataBase();
        MongoCollection<Document> collection = database.getCollection("singers");

        Document filter = new Document("id", id);
        Document update = new Document("$set", new Document()
                .append("name", updatedSinger.getName())
                .append("song", updatedSinger.getSong()));

        collection.updateOne(filter, update);
        System.out.println("Cantante actualizado en MongoDB");
    }

    public void deleteSinger(int id) {
        MongoDatabase database = connectionDataBase();
        MongoCollection<Document> collection = database.getCollection("singers");

        Document filter = new Document("id", id);
        collection.deleteOne(filter);
        System.out.println("Cantante eliminado de MongoDB");
    }
    public List<Houses> getAllSingers() {
        MongoDatabase database = connectionDataBase();
        MongoCollection<Document> collection = database.getCollection("singers");

        List<Houses> singers = new ArrayList<>();
        for (Document doc : collection.find()) {
            Houses singer = new Houses(
                doc.getInteger("id"),
                doc.getString("name"),
                doc.getString("song")
            );
            singers.add(singer);
        }
        return singers;
    }
}
