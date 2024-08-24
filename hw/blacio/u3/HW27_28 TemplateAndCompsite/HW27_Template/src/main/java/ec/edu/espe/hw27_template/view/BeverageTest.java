package ec.edu.espe.hw27_template.view;

import ec.edu.espe.hw27_template.model.Coffee;
import ec.edu.espe.hw27_template.model.Tea;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
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
