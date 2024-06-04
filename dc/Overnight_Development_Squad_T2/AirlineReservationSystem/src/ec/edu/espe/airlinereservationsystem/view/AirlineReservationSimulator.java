package ec.edu.espe.airlinereservationsystem.view;

import java.util.Scanner;
import utils.reservationSystem;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class AirlineReservationSimulator {
    public static void main(String[] args) {
        reservationSystem reservationSystemInstance = new reservationSystem();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Airline Reservation Simulator");
            System.out.println("1. Create Customer");
            System.out.println("2. Create Flight");
            System.out.println("3. Book Ticket");
            System.out.println("4. Make Payment");
            System.out.println("5. Add Offer");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter customer email: ");
                    String email = scanner.nextLine();
                    reservationSystemInstance.createCustomer(name, email);
                    System.out.println("Customer created successfully!");
                    break;
                case 2:
                    // TODO
                    break;
                case 3:
                    //TODO
                    break;
                case 4:
                    //TODO
                    break;
                case 5:
                    //TODO
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
