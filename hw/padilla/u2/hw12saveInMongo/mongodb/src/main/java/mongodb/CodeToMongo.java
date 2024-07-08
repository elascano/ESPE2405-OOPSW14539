
package mongodb;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class CodeToMongo {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read the IDE
        System.out.println("Enter the IDE:");
        String ide = scanner.nextLine();

        // Read the processor
        System.out.println("Enter the processor:");
        String processor = scanner.nextLine();

        // Read the brand
        System.out.println("Enter the brand:");
        String brand = scanner.nextLine();

        // Create a MongoDB client
        MongoClient mongoClient = MongoClients.create("mongodb+srv://mapadilla12:82410Loveadrian.@adrianpadilla.b8xh14p.mongodb.net/test?retryWrites=true&w=majority");

        // Get the database and collection
        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection<Document> collection = database.getCollection("register");

        // Create a document to store the data
        Document document = new Document("ide", ide)
                .append("processor", processor)
                .append("brand", brand);

        // Insert the document into the collection
        collection.insertOne(document);

        // Close the MongoDB client
        mongoClient.close();

        // Inform the user that the data has been saved
        System.out.println("Data saved to MongoDB.");
    }
}
