
package ec.edu.espe.SaveSmartTVObject.view;

import ec.edu.espe.SaveSmartTVObject.model.SmartTVPadilla;
import static ec.edu.espe.SaveSmartTVObject.utils.FileManager.saveObject;

/**
 *
 * @author Marco Padilla, CodeCrafting Engineers, DCCO-ESPE
 */
public class SmartTVSystem {

    public static void main(String[] args) {
        SmartTVPadilla smartTV = new SmartTVPadilla(1, "Samsung", "QLED", 1299.99f, true);
        System.out.println("SmartTV Data --> " + smartTV);
      
        saveObject(smartTV);
    }
}
