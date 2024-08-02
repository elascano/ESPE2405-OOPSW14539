/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.exam.controller;

/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.exam.model.Professor;
import org.bson.Document;
import org.bson.types.ObjectId;

public class ProfessorController {
    private static ProfessorController instance;
    private MongoCollection<Document> collection;

    private ProfessorController() {
        String connectionString = "mongodb+srv://pilaguano:pilaguano@cluster0.9goxw5i.mongodb.net/";
        MongoClient mongoClient = MongoClients.create(connectionString);
        MongoDatabase database = mongoClient.getDatabase("ExamPractice");
        this.collection = database.getCollection("Professor");
    }

    public static synchronized ProfessorController getInstance() {
        if (instance == null) {
            instance = new ProfessorController();
        }
        return instance;
    }

    public boolean deleteProfessor(String id) {
        DeleteResult result = collection.deleteOne(new Document("_id", new ObjectId(id)));
        return result.getDeletedCount() > 0;
    }

    public Professor findProfessorById(String id) {
        Document doc = collection.find(new Document("_id", new ObjectId(id))).first();
        if (doc != null) {
            return new Professor(
                doc.getObjectId("_id").toString(),
                doc.getString("name"),
                doc.getString("department"),
                doc.getDouble("salary")
            );
        }
        return null;
    }
}