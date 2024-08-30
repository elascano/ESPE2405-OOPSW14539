/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.managementuniversity.controller;

/**
 *
 * @author Ricardo lainez
 */
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private static final String CONNECTION_STRING = "mongodb+srv://ricardoandreslainezsuarez:ricardo_1422@ricardolainez.yyg9cp1.mongodb.net/";
    private static MongoClient mongoClient;
    private static MongoDatabase database;

    public static void connect() {
        mongoClient = MongoClients.create(CONNECTION_STRING);
        database = mongoClient.getDatabase("universities_db");
    }

    public static MongoDatabase getDatabase() {
        return database;
    }
}
