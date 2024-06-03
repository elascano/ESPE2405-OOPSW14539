
package utils;

import ec.edu.espe.airlinereservationsystem.model.Customer;
import ec.edu.espe.airlinereservationsystem.model.Flight;
import ec.edu.espe.airlinereservationsystem.model.Payment;
import ec.edu.espe.airlinereservationsystem.model.Ticket;
import enums.TicketClass;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class reservationSystem {
    private List<Customer> customers;
    private List<Flight> flights;
    private List<Ticket> tickets;
    private List<Payment> payments;
    private List<String> offers;

    public reservationSystem(List<Customer> customers, List<Flight> flights, List<Ticket> tickets, List<Payment> payments, List<String> offers) {
        this.customers = customers;
        this.flights = flights;
        this.tickets = tickets;
        this.payments = payments;
        this.offers = offers;
    }

    public Customer createCustomer(String name, String email) {
        int customerId = customers.size() + 1;
        Customer customer = new Customer(customerId, name, email);
        customers.add(customer);
        return customer;
    }

    public Flight createFlight(String origin, String destination, String airline, Date departureDate, Date arrivalDate) {
        int flightId = flights.size() + 1;
        Flight flight = new Flight(flightId, origin, destination, airline, departureDate, arrivalDate);
        flights.add(flight);
        return flight;
    }

    public Ticket bookTicket(Customer customer, Flight flight, TicketClass ticketClass, int numberOfPeople) {
        int ticketId = tickets.size() + 1;
        Ticket ticket = new Ticket(ticketId, customer, flight, ticketClass, numberOfPeople);
        tickets.add(ticket);
        customer.viewTicketHistory().add(ticket);
        return ticket;
    }
 
    /**
     * @return the customers
     */
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    /**
     * @return the flights
     */
    public List<Flight> getFlights() {
        return flights;
    }

    /**
     * @param flights the flights to set
     */
    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    /**
     * @return the tickets
     */
    public List<Ticket> getTickets() {
        return tickets;
    }

    /**
     * @param tickets the tickets to set
     */
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    /**
     * @return the payments
     */
    public List<Payment> getPayments() {
        return payments;
    }

    /**
     * @param payments the payments to set
     */
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    /**
     * @return the offers
     */
    public List<String> getOffers() {
        return offers;
    }

    /**
     * @param offers the offers to set
     */
    public void setOffers(List<String> offers) {
        this.offers = offers;
    }
    
    
}
