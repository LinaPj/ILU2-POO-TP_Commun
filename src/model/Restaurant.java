package model;

import java.util.ArrayList;

public class Restaurant {

    private ArrayList<ReservationRestaurant> reservations;

    public Restaurant() {
        reservations = new ArrayList<>();
    }

    public void ajouterReservation(ReservationRestaurant r) {
        reservations.add(r);
    }

    public ArrayList<ReservationRestaurant> getReservations() {
        return reservations;
    }
}