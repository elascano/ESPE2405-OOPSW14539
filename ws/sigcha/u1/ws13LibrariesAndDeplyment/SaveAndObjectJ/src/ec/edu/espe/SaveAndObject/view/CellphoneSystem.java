package ec.edu.espe.SaveAndObject.view;

import ec.edu.espe.SaveAndObject.model.Cellphone;
import static ec.edu.espe.SaveAndObject.utils.FileManager.saveObject;

/**
 *
 * @author Kenned Sigcha, PPS
 */
public class CellphoneSystem {

    public static void main(String[] args) {
        Cellphone cellphone;
        cellphone = new Cellphone(1, "Apple", "iPhone 14", 999.99, true);
        System.out.println("Cellphone Data --> " + cellphone);

        saveObject(cellphone);
    }
}
