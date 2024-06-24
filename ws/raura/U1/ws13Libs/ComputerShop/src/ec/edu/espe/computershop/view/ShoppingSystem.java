package ec.edu.espe.computershop.view;

import ec.edu.espe.computershop.model.Computer;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class ShoppingSystem {
    public static void main(String [] args){
        
        Computer computer;
        computer = new Computer(0, "HP", 1000);
        
        System.out.println("the price of this computer is -->" + computer.getPvp());
        System.out.println("->"+computer);
    }
    
}
