/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.utils;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/**
 *
 * @author G400
 */
public class MongoField {
    private static MongoClient createMongoClient() {
        // Cadena de conexión a tu base de datos MongoDB
        String connectionString = "mongodb+srv://MiguelAngel:miguel1234@cluster0.hovruoz.mongodb.net/
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .build();

        return MongoClients.create(settings);
    }

    private static void saveDocumentToCollection(Document document, MongoCollection<Document> collection) {
        try {
            collection.insertOne(document);
            System.out.println("Documento guardado exitosamente en MongoDB.");
        } catch (Exception e) {
            System.err.println("Error al guardar el documento: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("test"); // Nombre de la base de datos

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre: ");
            String name = scanner.nextLine();

            System.out.print("Ingrese la edad: ");
            int age = scanner.nextInt();

            // Crear un documento MongoDB
            Document document = new Document("Zoo Cloude", name)
                    .append("age", age);

            // Obtener una colección (o crearla si no existe)
            MongoCollection<Document> collection = database.getCollection("Animal");

            // Guardar el documento en la colección
            saveDocumentToCollection(document, collection);

            scanner.close();
        } catch (Exception e) {
            System.err.println("Error al conectar con MongoDB: " + e.getMessage());
        }
    }    
}
