/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Leydi Oña
 */
public class Conection {
    


public class MongoClientConnectionExample {
    public static void main(String[] args) {
        String connectionString = "mongodb+srv://leona4:<password>@ley.6c6gvcv.mongodb.net/?appName=ley";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("admin");
                database.runCommand(new Document("ping", 1));
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
    }
}

    /*private  MongoClient mongo;
    private MongoDatabase dataB;

    public MongoClient getMongo() {
        return mongo;
    }

    public MongoDatabase getDatabB() {
        return dataB;
    }

    

    public Conection() {
    }

    public Conection(MongoClient mongo, MongoDatabase databB) {
        this.mongo = mongo;
        this.dataB = databB;
    }    
    
    public Conection crearConcexion (){
        String servidor= "localhost";
        int puerto = 27017;
        try {
            mongo = new MongoClient(servidor,puerto);
            dataB = mongo.getDatabase("ZooDB");
            
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null, "Error  en la conexion a MongoDB :"+ex.toString());
        }
        return new Conection(mongo, dataB);
    }*/
}
