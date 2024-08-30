package ec.edu.espe.mongodb.view;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.mongodb.model.Soda;
import org.bson.Document;

import java.util.Scanner;

public class SaveToMongoDB {

    private static MongoClient createMongoClient() {
        String connectionString = "mongodb+srv://SrJCBM:OOP14539ODS@firstdb.gtv30gi.mongodb.net/?appName=FirstDB";
        
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        
        return MongoClients.create(settings);
    }

    private static void saveSodaToDatabase(Soda soda, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("sodas");

        Document sodaDocument = new Document("name", soda.getName())
                .append("brand", soda.getBrand())
                .append("flavor", soda.getFlavor())
                .append("sugarContent", soda.getSugarContent())
                .append("carbonationLevel", soda.getCarbonationLevel());

        try {
            collection.insertOne(sodaDocument);
            System.out.println("Soda saved successfully!");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("bottler");

            Scanner scanner = new Scanner(System.in);
            Soda soda = new Soda();

            System.out.println("Enter the soda details:");

            System.out.print("Name: ");
            soda.setName(scanner.nextLine());

            System.out.print("Brand: ");
            soda.setBrand(scanner.nextLine());

            System.out.print("Flavor: ");
            soda.setFlavor(scanner.nextLine());

            System.out.print("Sugar Content (in grams): ");
            soda.setSugarContent(scanner.nextDouble());

            System.out.print("Carbonation Level (0-10): ");
            soda.setCarbonationLevel(scanner.nextInt());

            saveSodaToDatabase(soda, database);
        }
    }
}
