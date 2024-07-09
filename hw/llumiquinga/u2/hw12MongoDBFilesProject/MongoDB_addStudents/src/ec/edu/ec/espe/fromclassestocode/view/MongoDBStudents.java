package ec.edu.ec.espe.fromclassestocode.view;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.Scanner;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class MongoDBStudents {

    public static void main(String[] args) {
        // Cadena de conexión de MongoDB Atlas
         String uri = "mongodb://localhost:27017/oop";
        MongoClient mongoClient = new MongoClient(new MongoClientURI(uri));

        // Selección de la base de datos
        MongoDatabase database = mongoClient.getDatabase("oop");

        // Selección de la colección
        MongoCollection<Document> collection = database.getCollection("students");

        // Crear un objeto Scanner para leer datos del teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese ID:");
        String id = scanner.nextLine();

        System.out.println("Ingrese nombre:");
        String name = scanner.nextLine();

        System.out.println("Ingrese fecha de nacimiento (YYYY/MM/DD):");
        String bornOnDate = scanner.nextLine();

        System.out.println("Ingrese promedio:");
        String average = scanner.nextLine();

        System.out.println("Es hombre (true/false):");
        boolean male = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Número de hermanos:");
        int siblings = Integer.parseInt(scanner.nextLine());

        // Crear un documento BSON con los datos
        Document document = new Document("id", id)
                .append("name", name)
                .append("bornOnDate", bornOnDate)
                .append("average", average)
                .append("male", male)
                .append("siblings", siblings);

        // Insertar el documento en la colección
        collection.insertOne(document);

        System.out.println("Documento insertado exitosamente!");

        // Cerrar el cliente MongoDB
        mongoClient.close();
    }
}
