
package ec.edu.espe.computershop.view;

import ec.edu.espe.computershop.model.Computer;

/**
 *
 * @author David Pilaguano, Lenovo , DDCCE
 */
public class ShoppingSystem {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer (0,"HP", 1000);
        System.out.println("The price of this computer is --> " + computer.getPvp() );
        
    }
    
}
