/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insertdatatomongo;

/**
 *
 * @author Ricardo Lainez
 */

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Collection;
import java.util.Scanner;
import org.bson.Document;


public class CodeToMongo {

    public static void main(String[] args) {
        MongoClient mongoclient = createConnection();
        
        if(mongoclient!= null){
            System.out.println("connecting succesfully");
            
            MongoDatabase database = mongoclient.getDatabase("register");
            MongoCollection<Document> collection = database.getCollection("students");
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("insert ID");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("insert name: ");
            String name = scanner.nextLine();
            
            System.out.println("insert email: ");
            String email = scanner.nextLine();
            
            Document document = new Document("id", id).append("name", name).append("email", email);
            collection.insertOne(document);
            
            System.out.println("document insert succesfully");
            
        }else{
            System.out.println("error to connecting to mongodb");
        }
        
    }

    private static MongoClient createConnection() {
        System.out.println("connecting to mongo..");
        try{
            MongoClient mongoclient = MongoClients.create("mongodb+srv://ricardoandreslainezsuarez:ricardo_1422@ricardolainez.yyg9cp1.mongodb.net/");
            return mongoclient;
            
        }catch(Exception e){
            System.err.println("Error to connecting to MongoDB: " + e.getMessage());
            return null;
        }
    }


}

