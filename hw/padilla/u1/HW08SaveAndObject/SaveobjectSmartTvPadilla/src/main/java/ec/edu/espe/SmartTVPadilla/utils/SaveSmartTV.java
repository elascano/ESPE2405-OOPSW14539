
package ec.edu.espe.SmartTVPadilla.utils;

import ec.edu.espe.SmartTVPadilla.model.SmartTV;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Marco Padilla, CodeCrafting Engineers, DCCO-ESPE
 */


public class SaveSmartTV {

    public static void main(String[] args) {
        SmartTV smartTVPadilla = new SmartTV("Samsung", "Q60T", 55);

        try (FileOutputStream fileOut = new FileOutputStream("smartTVPadilla.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(smartTVPadilla);
            System.out.println("The object has been saved in smartTVPadilla.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
