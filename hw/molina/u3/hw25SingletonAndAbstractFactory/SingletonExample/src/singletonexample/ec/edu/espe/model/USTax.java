
package singletonexample.ec.edu.espe.model;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class USTax {
    private static USTax instance;
    
    public static USTax getInstance(){
        if(instance == null)
            instance = new USTax();
        return instance;
    }
    
    public float salesTotal(){
        float price = 0;
        return price;
    }
}
