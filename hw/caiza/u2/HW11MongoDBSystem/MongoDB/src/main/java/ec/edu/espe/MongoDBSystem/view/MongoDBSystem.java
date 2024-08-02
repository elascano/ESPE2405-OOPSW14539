package ec.edu.espe.MongoDBSystem.view;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.MongoDBSystem.model.Students;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class MongoDBSystem {
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

    private static void saveStudentToDatabase(Students student, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("students");

        Document studentDocument = new Document("id", student.getId())
                .append("name", student.getName())
                .append("bornOnDate", student.getBornOnDate())
                .append("average", student.getAverage())
                .append("male", student.isMale())
                .append("siblings", student.getSiblings());

        try {
            collection.insertOne(studentDocument);
            System.out.println("Student saved successfully!");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("school");

            Scanner scanner = new Scanner(System.in);
            Students student = new Students();

            System.out.println("Enter the student details:");

            System.out.print("ID: ");
            student.setId(scanner.nextLine());

            System.out.print("Name: ");
            student.setName(scanner.nextLine());

            System.out.print("Born On Date (yyyy-MM-dd): ");
            String dateStr = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date bornOnDate;
            try {
                bornOnDate = sdf.parse(dateStr);
                student.setBornOnDate(bornOnDate);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
                return;
            }

            System.out.print("Average: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for average:");
                scanner.next(); // Clear the invalid input
            }
            student.setAverage(scanner.nextDouble());

            System.out.print("Male (true/false): ");
            while (!scanner.hasNextBoolean()) {
                System.out.println("Invalid input. Please enter true or false:");
                scanner.next(); // Clear the invalid input
            }
            student.setMale(scanner.nextBoolean());

            System.out.print("Number of Siblings: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer for number of siblings:");
                scanner.next(); // Clear the invalid input
            }
            student.setSiblings(scanner.nextInt());

            saveStudentToDatabase(student, database);
        }
    }
}
