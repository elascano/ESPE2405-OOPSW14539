/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SchoolGUI.utils;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import ec.edu.espe.SchoolGUI.model.School;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */


public class toMongoDB {
    private static final String CONNECTION_STRING = "mongodb+srv://JersonLlM:jersonllm23@cluster0.yjwpgvg.mongodb.net/";
    private static MongoClient mongoClient = MongoClients.create(CONNECTION_STRING);
    private static MongoDatabase database = mongoClient.getDatabase("SchoolRegister");

    public static void SchoolRegister(School school) {
        MongoCollection<Document> collection = database.getCollection("school");
        Document doc = new Document("id", school.getId())
                        .append("adress", school.getAdress())
                        .append("city", school.getCity())
                        .append("phone", school.getPhone());
        collection.insertOne(doc);
    }
    }