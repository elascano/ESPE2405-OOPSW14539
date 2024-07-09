/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mongotable.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
/**
 *
 * @author Yostin Sisalema,Code Master, DCCO-ESPE
 */
public class Connection {
    public static MongoDatabase mongodb = null;

    public MongoDatabase connectionDataBase() {
        if (mongodb == null) {
            String uri = "mongodb+srv://yasisalema:yasisalema@cluster0.51fic9g.mongodb.net/Tables";
            String db = "Tables";
            try {
                MongoClient mongoClient = MongoClients.create(uri);
                Connection.mongodb = mongoClient.getDatabase(db);
                System.out.println("Connected successfully to database");
            } catch (Exception e) {
                System.err.println("Error connecting to database: " + e.getMessage());
            }
        }
        return Connection.mongodb;
    }
}
