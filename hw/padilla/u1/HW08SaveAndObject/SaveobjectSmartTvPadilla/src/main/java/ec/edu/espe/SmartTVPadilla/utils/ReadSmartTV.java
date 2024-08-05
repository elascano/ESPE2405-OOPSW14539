
package ec.edu.espe.SmartTVPadilla.utils;

import ec.edu.espe.SmartTVPadilla.model.SmartTV;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 * @author Marco Padilla, CodeCrafting Engineers, DCCO-ESPE
 */

public class ReadSmartTV {

    public static void main(String[] args) {
        SmartTV smartTVPadilla = null;

        try (FileInputStream fileIn = new FileInputStream("smartTVPadilla.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            smartTVPadilla = (SmartTV) in.readObject();
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }

        if (smartTVPadilla != null) {
            System.out.println("Read object: " + smartTVPadilla);
        }
    }
}
