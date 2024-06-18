package utils;
import ec.edu.espe.saveanobject.model.Toy 
import java.io.*;
/**
 * Clase utilitaria para serializar y deserializar objetos Toy.
 * 
 * @autor Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class SerializeUtil {
    public static void saveToFile(String fileName, Serializable obj) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(obj);
        } catch (Exception e) {
        }
    }

    public static Object readFromFile(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return in.readObject();
        } catch (Exception e) {
            return 0;
        }
    }
}
