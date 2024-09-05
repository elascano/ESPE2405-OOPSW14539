package singletonexample.ec.edu.espe.view;

import singletonexample.ec.edu.espe.model.USTax;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class Calculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        tax.salesTotal();
    }
}
