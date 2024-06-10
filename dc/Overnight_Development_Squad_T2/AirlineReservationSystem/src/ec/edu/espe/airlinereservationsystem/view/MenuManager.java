package ec.edu.espe.airlinereservationsystem.view;

import utils.ReservationSystem;
import enums.TicketClass;
import ec.edu.espe.airlinereservationsystem.model.Customer;
import ec.edu.espe.airlinereservationsystem.model.Flight;
import ec.edu.espe.airlinereservationsystem.model.Ticket;
import enums.PaymentMethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import utils.CustomerDataManager;
import utils.JsonUtils;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class MenuManager {

    private final ReservationSystem reservationSystemInt;
    private final Scanner scanner;
    private static final String CUSTOMER_DATA_FILE = "customers.json";

    public MenuManager(ReservationSystem reservationSystemInt) {
        this.reservationSystemInt = reservationSystemInt;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("Airline Reservation Simulator");
            System.out.println("1. Create Customer");
            System.out.println("2. Create Flight");
            System.out.println("3. Book Ticket");
            System.out.println("4. Add Offer");
            System.out.println("5. View Ticket History");
            System.out.println("6. Add Baggage");
            System.out.println("7. Change Flight Date");
            System.out.println("8. Update Ticket Status");
            System.out.println("9. View Offers");
            System.out.println("10. FAQ");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createCustomer();
                    break;
                case 2:
                    createFlight();
                    break;
                case 3:
                    bookTicket();
                    break;
                case 4:
                    addOffer();
                    break;
                case 5:
                    viewTicketHistory();
                    break;
                case 6:
                    addBaggage();
                    break;
                case 7:
                    changeFlightDate();
                    break;
                case 8:
                    updateTicketStatus();
                    break;
                case 9:
                    viewOffers();
                    break;
                case 10:
                    displayFAQ();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private void createCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();

        Customer customer = reservationSystemInt.getCustomerManager().createCustomer(name, email);
        System.out.println("Customer created successfully! Customer ID: " + customer.getCustomerId());

        // Save customers to JSON file
        List<Customer> customers = reservationSystemInt.getCustomerManager().getAllCustomers();
        CustomerDataManager.saveCustomers(customers);
    }

    private void createFlight() {
        System.out.print("Enter origin: ");
        String origin = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter airline: ");
        String airline = scanner.nextLine();
        System.out.print("Enter departure date (yyyy-MM-dd): ");
        String depDateStr = scanner.nextLine();
        System.out.print("Enter arrival date (yyyy-MM-dd): ");
        String arrDateStr = scanner.nextLine();
        try {
            Date depDate = new SimpleDateFormat("yyyy-MM-dd").parse(depDateStr);
            Date arrDate = new SimpleDateFormat("yyyy-MM-dd").parse(arrDateStr);
            Flight flight = reservationSystemInt.getFlightManager().createFlight(origin, destination, airline, depDate, arrDate);
            System.out.println("Flight created successfully! Flight ID: " + flight.getFlightId());
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please try again.");
        }
    }

    private void bookTicket() {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter flight ID: ");
        int flightId = scanner.nextInt();
        System.out.print("Enter ticket class (ECONOMY/BUSINESS): ");
        scanner.nextLine(); // Consume newline
        String ticketClassStr = scanner.nextLine();
        TicketClass ticketClass = TicketClass.valueOf(ticketClassStr.toUpperCase());
        System.out.print("Enter number of people: ");
        int numberOfPeople = scanner.nextInt();

        try {
            ticketClass = TicketClass.valueOf(ticketClassStr.toUpperCase());
            Customer customer = reservationSystemInt.getCustomerManager().getCustomer(customerId);
            Flight flight = reservationSystemInt.getFlightManager().getFlight(flightId);
            Ticket ticket = reservationSystemInt.getTicketManager().bookTicket(customer, flight, ticketClass, numberOfPeople);
            System.out.println("Ticket booked successfully!");

            customer.addTicket(ticket);

            // Calculate total price
            double totalPrice = ticketClass.getPrice() * numberOfPeople;

            // Proceed to payment
            System.out.print("Enter payment method (CREDIT_CARD, DEBIT_CARD, PAYPAL): ");
            scanner.nextLine();
            String paymentMethodStr = scanner.nextLine();

            PaymentMethods paymentMethod = PaymentMethods.valueOf(paymentMethodStr.toUpperCase());
            reservationSystemInt.getPaymentManager().makePayment(paymentMethod, totalPrice);
            System.out.println("Payment made successfully!");

            List<Customer> customers = reservationSystemInt.getCustomerManager().getAllCustomers();
            JsonUtils.saveCustomersToFile(customers, CUSTOMER_DATA_FILE);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid customer ID or flight ID. Please try again.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    private void makePayment() {
        System.out.print("Enter payment method (CREDIT_CARD, DEBIT_CARD, PAYPAL): ");
        String paymentMethodStr = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        try {
            PaymentMethods paymentMethod = PaymentMethods.valueOf(paymentMethodStr.toUpperCase());
            reservationSystemInt.getPaymentManager().makePayment(paymentMethod, amount);
            System.out.println("Payment made successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid payment method. Please try again.");
        }
    }

    private void addOffer() {
        System.out.print("Enter offer details: ");
        String offer = scanner.nextLine();
        reservationSystemInt.getOfferManager().addOffer(offer);
        System.out.println("Offer added successfully!");
    }

    private void viewTicketHistory() {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        try {
            Customer customer = reservationSystemInt.getCustomerManager().getCustomer(customerId);
            reservationSystemInt.getTicketManager().viewTicketHistory(customer);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid customer ID. Please try again.");
        }
    }

    private void addBaggage() {
        System.out.print("Enter ticket ID: ");
        int ticketId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter number of carry-on baggage: ");
        int carryOn = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter number of checked baggage: ");
        int checked = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        try {
            Ticket ticket = reservationSystemInt.getTicketManager().getTicket(ticketId);
            reservationSystemInt.getTicketManager().addBaggage(ticket, carryOn, checked);
            System.out.println("Baggage added successfully!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid ticket ID. Please try again.");
        }
    }

    private void changeFlightDate() {
        System.out.print("Enter ticket ID: ");
        int ticketId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new departure date (yyyy-MM-dd): ");
        String newDepDateStr = scanner.nextLine();
        System.out.print("Enter new arrival date (yyyy-MM-dd): ");
        String newArrDateStr = scanner.nextLine();
        try {
            Date newDepDate = new SimpleDateFormat("yyyy-MM-dd").parse(newDepDateStr);
            Date newArrDate = new SimpleDateFormat("yyyy-MM-dd").parse(newArrDateStr);
            Ticket ticket = reservationSystemInt.getTicketManager().getTicket(ticketId);
            reservationSystemInt.getTicketManager().changeFlightDate(ticket, newDepDate, newArrDate);
            System.out.println("Flight date changed successfully!");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please try again.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid ticket ID. Please try again.");
        }
    }

    private void updateTicketStatus() {
        System.out.print("Enter ticket ID: ");
        int ticketId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new status: ");
        String status = scanner.nextLine();
        try {
            Ticket ticket = reservationSystemInt.getTicketManager().getTicket(ticketId);
            reservationSystemInt.getTicketManager().updateTicketStatus(ticket, status);
            System.out.println("Ticket status updated successfully!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid ticket ID. Please try again.");
        }
    }

    private void viewOffers() {
        reservationSystemInt.getOfferManager().listOffers();
    }

    private void displayFAQ() {
        reservationSystemInt.getFaqManager().displayFAQ();
    }
}
