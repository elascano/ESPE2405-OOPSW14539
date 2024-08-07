package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.zoo.model.Animal;
import org.bson.Document;

/**
 *
 * @author Alfonso Arroyo
 */

public class FileCloud {
    private static final String CONNECTION_STRING = "mongodb+srv://aaarroyo6:aaarroyo6@cluster0.govonbe.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "ws26Zoo";
    private static final String COLLECTION_NAME = "Zoo";

    public static void saveAnimalToCloud(Animal animal) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(animal);

            MongoClientURI uri = new MongoClientURI(CONNECTION_STRING);
            try (MongoClient mongoClient = new MongoClient(uri)) {
                MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
                MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);
                Document doc = createDocumentFromJson(json);
                collection.insertOne(doc);
            }

            System.out.println("Animal saved to cloud: " + json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private static Document createDocumentFromJson(String json) {
        return Document.parse(json);
    }
}


