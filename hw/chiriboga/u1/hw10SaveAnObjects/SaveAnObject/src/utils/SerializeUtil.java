package utils;
import ec.edu.espe.saveanobject.model.Computer;
import java.io.*;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */

public class SerializeUtil {
    public static void create(String fileName, Computer computer) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(computer);
            System.out.println("Objeto serializado y guardado en " + fileName);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static Computer read(String fileName) {
        Computer computer = null;
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            computer = (Computer) in.readObject();
            System.out.println("Objeto deserializado: " + computer);
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Clase Computer no encontrada");
            c.printStackTrace();
        }
        return computer;
    }
}

