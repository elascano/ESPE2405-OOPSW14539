package ec.edu.espe.saveanobject.view;

import ec.edu.espe.saveanobject.model.Clock;
import ec.edu.espe.saveanobject.utils.Serializable;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Yostin Sisalema,Code Master,DCC0-ESPE
 */

 public class ClockSystem {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Clock> clocks = new ArrayList<>();
        boolean continueInput = true;
        do {
            System.out.println("1. Create clock");
            System.out.println("2. Read Computer");    
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Serializable.createCock(scanner,clocks);
                    break;
                case 2:
                    Serializable.read(scanner,clocks);
                    break;
                case 3:
                    continueInput = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (continueInput);

        Serializable.saveJson(clocks);
    }
}