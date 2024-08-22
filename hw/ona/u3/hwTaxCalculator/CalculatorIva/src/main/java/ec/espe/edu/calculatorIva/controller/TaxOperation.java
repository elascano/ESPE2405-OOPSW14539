
package ec.espe.edu.calculatorIva.controller;

import ec.espe.edu.calculatorIva.model.EcTax;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Leydi Oña
 */
public class TaxOperation {
    public static float calculateTotal(EcTax tax , float value){
        
        float total = value+ value*tax.getTaxPorcentage()/100;
        BigDecimal bd = new BigDecimal(Float.toString(total));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        float totalDecimal = bd.floatValue(); 
        return totalDecimal;
    }

}
