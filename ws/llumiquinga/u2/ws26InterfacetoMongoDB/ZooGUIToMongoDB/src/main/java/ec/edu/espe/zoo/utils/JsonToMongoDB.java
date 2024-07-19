/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.utils;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class JsonToMongoDB {
   private static final String CONNECTION_STRING = "mongodb+srv://JersonLlM:jersonllm23@cluster0.yjwpgvg.mongodb.net/zoo?retryWrites=true&w=majority";
    private MongoClient mongoClient;
    private MongoDatabase database;
    
    public JsonToMongoDB() {
        try {
            // Crear una instancia del cliente de MongoDB
            mongoClient = MongoClients.create(CONNECTION_STRING);
            // Acceder a la base de datos "zoo"
            database = mongoClient.getDatabase("zoo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void uploadJsonData(String jsonFilePath, String collectionName) {
        try {
            // Leer el archivo JSON
            FileReader fileReader = new FileReader(jsonFilePath);
            Gson gson = new Gson();
            List<Document> documents = gson.fromJson(fileReader, new TypeToken<List<Document>>(){}.getType());

            // Acceder a la colección especificada
            MongoCollection<Document> collection = database.getCollection(collectionName);

            // Insertar documentos en la colección
            collection.insertMany(documents);
            System.out.println("Datos del JSON subidos exitosamente a la colección " + collectionName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
            System.out.println("Conexión cerrada.");
        }
    }

    public static void main(String[] args) {
        JsonToMongoDB jsonToMongoDB = new JsonToMongoDB();
        jsonToMongoDB.uploadJsonData("C:\\Users\\JERSON\\Documents\\NetBeansProjects\\ZooGUIToMongoDB\\animal.json", "animals"); // Cambia "path/to/farm.json" por la ruta a tu archivo JSON
        jsonToMongoDB.closeConnection();
    }
}
