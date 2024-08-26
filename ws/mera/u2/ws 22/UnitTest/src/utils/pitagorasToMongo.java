/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author heiso
 */
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class pitagorasToMongo {
    private static final String URI = "mongodb+srv://sol:sol@hsmera.ln6djqr.mongodb.net/?retryWrites=true&w=majority&appName=hsmera";
    private static final String DATABASE_NAME = "pitagoras";
    private static final String COLLECTION_NAME = "triangulos";
    private static MongoClient mongoClient;
    private static MongoDatabase database;

    static {
        mongoClient = MongoClients.create(URI);
        database = mongoClient.getDatabase(DATABASE_NAME);
    }

    public static void saveTriangulo(Triangulo triangulo) {
        MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);
        Document document = new Document("catetoA", triangulo.getCatetoA())
                .append("catetoB", triangulo.getCatetoB())
                .append("hipotenusa", triangulo.getHipotenusa());
        collection.insertOne(document);
    }
}
