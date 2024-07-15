package ec.edu.espe.interfacecloud.view;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.interfacecloud.model.Car;

import org.bson.Document;

import java.util.Scanner;
import java.time.Year;

public class ToCloud {

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

    private static void saveCarToDatabase(Car car, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("cars");

        Document carDocument = new Document("make", car.getMake())
                .append("model", car.getModel())
                .append("year", car.getYear())
                .append("age", car.getAge())
                .append("depreciation", car.getDepreciation());

        try {
            collection.insertOne(carDocument);
            System.out.println("Car saved successfully!");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("CarAgency");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter car make: ");
            String make = scanner.nextLine();

            System.out.print("Enter car model: ");
            String model = scanner.nextLine();

            System.out.print("Enter car year: ");
            int year = scanner.nextInt();

            Car car = new Car(make, model, year);
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println("Age: " + car.getAge());
            System.out.println("Depreciation: $" + car.getDepreciation());

            saveCarToDatabase(car, database);

            scanner.close();
        }
    }
}
