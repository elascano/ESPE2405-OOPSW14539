
package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.zoo.model.Animal;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 *
 * @author Leydi Oña
 */
public class JsonGenerator {

    

 public static void guardarJson(Map<String, Object> datos, String nombreArchivo) {
        // Crear una instancia de Gson con un formato de impresión bonita (pretty printing)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convertir el mapa de datos a formato JSON
        String json = gson.toJson(datos);

        // Escribir el JSON en un archivo
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
 }
}