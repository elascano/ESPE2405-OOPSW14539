package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.model.USTax;
import java.util.Scanner;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class  Calculator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio base: ");
        float basePrice = scanner.nextFloat();

        System.out.print("Ingrese la tasa de impuesto (%): ");
        float taxRate = scanner.nextFloat();

        USTax taxCalculator = USTax.getInstance();

        taxCalculator.setTaxRate(taxRate);
        float totalPrice = taxCalculator.calculateTotal(basePrice);

        System.out.println("El precio total con impuesto es: " + totalPrice);
    }
}


