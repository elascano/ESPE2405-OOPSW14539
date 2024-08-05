/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.stores_exam2.controller;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import ec.edu.espe.stores_exam2.model.Store;
import org.bson.Document;
import org.bson.conversions.Bson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class StoreDAO {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public StoreDAO() {
        mongoClient = MongoClients.create("mongodb+srv://saraguro:saraguro@cluster0.5nyjils.mongodb.net/");
        database = mongoClient.getDatabase("storeDB");
        collection = database.getCollection("stores");
    }

    public void addStore(Store store) {
        Document doc = new Document("id", store.getId())
                            .append("name", store.getName())
                            .append("location", store.getLocation())
                            .append("revenue", store.getRevenue())
                            .append("numberOfEmployees", store.getNumberOfEmployees())
                            .append("storeType", store.getStoreType());
        collection.insertOne(doc);
    }

    public List<Store> getAllStores() {
        List<Store> stores = new ArrayList<>();
        for (Document doc : collection.find()) {
            stores.add(new Store(
                doc.getString("id"),
                doc.getString("name"),
                doc.getString("location"),
                doc.getDouble("revenue"),
                doc.getInteger("numberOfEmployees"),
                doc.getString("storeType")
            ));
        }
        return stores;
    }

    public Store getStoreById(String id) {
        Bson filter = Filters.eq("id", id);
        Document doc = collection.find(filter).first();
        if (doc != null) {
            return new Store(
                doc.getString("id"),
                doc.getString("name"),
                doc.getString("location"),
                doc.getDouble("revenue"),
                doc.getInteger("numberOfEmployees"),
                doc.getString("storeType")
            );
        }
        return null;
    }

    public void updateStore(Store store) {
        Bson filter = Filters.eq("id", store.getId());
        Document updateDoc = new Document("$set", new Document("name", store.getName())
                            .append("location", store.getLocation())
                            .append("revenue", store.getRevenue())
                            .append("numberOfEmployees", store.getNumberOfEmployees())
                            .append("storeType", store.getStoreType()));
        collection.updateOne(filter, updateDoc);
    }

    public void deleteStore(String id) {
        Bson filter = Filters.eq("id", id);
        collection.deleteOne(filter);
    }

    public void close() {
        mongoClient.close();
    }
}
