package ec.edu.espe.beveragesystem.view;
import ec.edu.espe.beveragesystem.model.Coffee;
import ec.edu.espe.beveragesystem.model.Tea;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class BeverageTest {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("\nMaking tea ...");
        tea.prepareRecipe();
        
        System.out.println("\nMaking coffee ...");
        coffee.prepareRecipe();
    }
}
