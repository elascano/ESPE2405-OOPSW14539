package ec.edu.espe.computershop.view;

import ec.edu.espe.computershop.model.Computer;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class ShoppingSystem {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer(0, "hp", 1000);
        System.out.println("the price of the computer is--> " + computer.getPvp());
        System.out.println("--> " +computer);
    }
}
