package ec.edu.espe.mongodb_addstudents.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class MainApp {
        public static void main(String[] args) {
        // Obtener la base de datos usando la clase Connection
        MongoDatabase database = MongoDBConnection.getDatabase();

        // Obtener la colección de estudiantes
        MongoCollection<Document> collection = database.getCollection("addstudents");

        // Crear un documento para insertar
        Document document = new Document("id", "L00429515")
                .append("name", "Jerson Llumiquinga M")
                .append("male", true)
                .append("bornOnDate", "2003-12-23")
                .append("gpa", 8.72)
                .append("email", "jersonllm@hotmail.es");

        try {
            // Insertar el documento en la colección
            collection.insertOne(document);
            System.out.println("Datos insertados correctamente!");

            // Verificar la inserción de datos
            Document insertedDocument = collection.find(new Document("id", "L00429515")).first();
            if (insertedDocument != null) {
                System.out.println("Documento encontrado en la colección: " + insertedDocument.toJson());
            } else {
                System.out.println("Documento no encontrado en la colección.");
            }
        } catch (Exception e) {
            System.err.println("Error al insertar el documento: " + e.getMessage());
        }
    }
}
