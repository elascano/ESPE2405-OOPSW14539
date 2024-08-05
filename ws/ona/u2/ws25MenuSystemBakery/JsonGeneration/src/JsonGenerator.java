

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Leydi Oña
 */
public class JsonGenerator {
    public static void guardarJson(Object datos, String nombreArchivo) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            gson.toJson(datos, writer);
            System.out.println("Datos guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo JSON: " + e.getMessage());
        }
    }
}
