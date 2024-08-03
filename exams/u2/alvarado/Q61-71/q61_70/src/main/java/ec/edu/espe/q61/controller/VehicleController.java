/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q61.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.q61.model.Vehicle;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Frank Alvarado
 */
public class VehicleController {
    public static void create(Vehicle vehicle){
        
        String uri = "mongodb+srv://ffalvarado:frank123@databsas.tuxhrit.mongodb.net/CraftStoreDB?retryWrites=true&w=majority";

        MongoDatabase db = MongoDbConection.getConnection(uri, "Exam2");

        MongoCollection vehiclesCollection = db.getCollection("Vehicles");

        Document vehicleDoc = new Document("_id", new ObjectId()).
                  append("id",vehicle.getId()).
                  append("mark",vehicle.getMark()).
                  append("horsesPower",vehicle.getHorsesPower());
        vehiclesCollection.insertOne(vehicleDoc);
    }
    
}
