
package ec.edu.espe.airlinereservationsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import enums.TicketClass;
import enums.TicketStatus;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */

public class Ticket {
    private int ticketId;
    private Customer customer;
    private Flight flight;
    private TicketClass ticketClass;
    private int numberOfPeople;
    private List<Baggage> baggages;
    private TicketStatus status;
    private List<TicketStatus> history;

    public Ticket(int ticketId, Customer customer, Flight flight, TicketClass ticketClass, int numberOfPeople) {
        this.ticketId = ticketId;
        this.customer = customer;
        this.flight = flight;
        this.ticketClass = ticketClass;
        this.numberOfPeople = numberOfPeople;
        this.baggages = new ArrayList<>();
        this.status = TicketStatus.BOOKED;
        this.history = new ArrayList<>();
    }

    public void addBaggage(Baggage baggage) {
        baggages.add(baggage);
    }

    public void sendTicketEmail() {
        System.out.println("Ticket sent to " + customer.getEmail());
    }

    public void changeDate(Date newDepartureDate, Date newArrivalDate) {
        if (ticketClass == TicketClass.BUSINESS) {
            flight.setDepartureDate(newDepartureDate);
            flight.setArrivalDate(newArrivalDate);
        } else {
            System.out.println("Date change allowed only for business class tickets");
        }
    }

    public TicketStatus viewTicketStatus() {
        return status;
    }

    public void updateTicketStatus(TicketStatus status) {
        this.status = status;
        history.add(status);
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public TicketClass getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public List<Baggage> getBaggages() {
        return baggages;
    }

    public void setBaggages(List<Baggage> baggages) {
        this.baggages = baggages;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public List<TicketStatus> getHistory() {
        return history;
    }

    public void setHistory(List<TicketStatus> history) {
        this.history = history;
    }
}

