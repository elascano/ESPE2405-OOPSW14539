package ec.edu.espe.airlinereservationsystem.view;

import utils.ReservationSystem;

public class AirlineReservationSimulator {

    public static void main(String[] args) {
        ReservationSystem reservationSystemInt = ReservationSystem.getInstance();
        MenuManager menuManager = new MenuManager(reservationSystemInt);
        menuManager.displayMenu();
    }
}
