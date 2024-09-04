
package ec.edu.espe.view;

import ec.edu.espe.model.Coffee;
import ec.edu.espe.model.Tea;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
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
