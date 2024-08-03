
package ec.edu.espe.examspeakers.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.examspeakers.model.Speaker;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Sjean
 */
public class SpeakerDAOMongoDB implements SpeakerDAO {
    private MongoCollection<Document> collection;

    public SpeakerDAOMongoDB() {
        String connectionString = "mongodb+srv://sjeancarlo:sjeancarlo@cluster0.3ixvnnj.mongodb.net/?appName=Cluster0";
        MongoClient mongoClient = MongoClients.create(connectionString);
        MongoDatabase database = mongoClient.getDatabase("speakerdb");
        this.collection = database.getCollection("speakers");
    }

    @Override
    public void create(Speaker speaker) {
        Document doc = new Document("_id", speaker.getId())
                .append("brand", speaker.getBrand())
                .append("power", speaker.getPower())
                .append("frequency", speaker.getFrequency());
        collection.insertOne(doc);
    }

    @Override
    public Speaker read(String id) {
        Document doc = collection.find(new Document("_id", id)).first();
        if (doc != null) {
            return new Speaker(
                doc.getString("_id"),
                doc.getString("brand"),
                doc.getDouble("power"),
                doc.getDouble("frequency")
            );
        }
        return null;
    }

    @Override
    public void update(Speaker speaker) {
        Document query = new Document("_id", speaker.getId());
        Document update = new Document("$set", new Document("brand", speaker.getBrand())
                .append("power", speaker.getPower())
                .append("frequency", speaker.getFrequency()));
        collection.updateOne(query, update);
    }

    @Override
    public void delete(String id) {
        collection.deleteOne(new Document("_id", id));
    }

    @Override
    public List<Speaker> listAll() {
        List<Speaker> speakers = new ArrayList<>();
        for (Document doc : collection.find()) {
            speakers.add(new Speaker(
                doc.getString("_id"),
                doc.getString("brand"),
                doc.getDouble("power"),
                doc.getDouble("frequency")
            ));
        }
        return speakers;
    }
}
