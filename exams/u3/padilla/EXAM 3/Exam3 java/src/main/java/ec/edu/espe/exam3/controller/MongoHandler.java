package ec.edu.espe.exam3.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam3.model.SortApp;
import java.util.Arrays;
import org.bson.Document;


/**
 *
 * @author Marco Padilla
 */
public class MongoHandler {
    public boolean register(SortApp sort) {

        MongoClient mongoClient = MongoClients.create("mongodb+srv://mapadilla12:82410Loveadrian.@adrianpadilla.b8xh14p.mongodb.net/");
        MongoDatabase db = mongoClient.getDatabase("StrategyPadilla");
        
        Document doc = new Document();
        doc.append("unsorted", Arrays.toString(sort.getUnsorted()))
                .append("size", sort.getSize())
                .append("sortAlgorithm", sort.getSortAlgorithm())
                .append("sorted", Arrays.toString(sort.getSorted()));
        MongoCollection<Document> collection = db.getCollection("ArrayAdrian");
        collection.insertOne(doc);

        return true;
    }
}
