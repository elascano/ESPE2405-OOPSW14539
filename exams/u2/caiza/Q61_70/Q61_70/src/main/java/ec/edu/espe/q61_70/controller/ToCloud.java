package ec.edu.espe.q61_70.controller;

/**
 *
 * @author Miguel Caiza, Overnight Developers Squad, DCCO-ESPE
 */
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ToCloud {

    private static MongoClient createMongoClient() {
        String connectionString = "mongodb+srv://MiguelAngel:miguel1234@cluster0.hovruoz.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        return MongoClients.create(settings);
    }

    public static void uploadCountryData(String name, String capital, long population, double area, double density) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("CountryDatabase");

            saveCountryToDatabase(name, capital, population, area, density, database);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void saveCountryToDatabase(String name, String capital, long population, double area, double density, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("countries");

        Document countryDocument = new Document("name", name)
                .append("capital", capital)
                .append("population", population)
                .append("area", area)
                .append("density", density);

        try {
            collection.insertOne(countryDocument);
            System.out.println("Country data saved successfully!");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }
}