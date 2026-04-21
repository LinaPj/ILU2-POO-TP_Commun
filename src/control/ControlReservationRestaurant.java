package control;

import model.ReservationRestaurant;
import model.Restaurant;

public class ControlReservationRestaurant {

    private Restaurant restaurant;

    public ControlReservationRestaurant() {
        restaurant = new Restaurant();
    }

    public ReservationRestaurant reserver(int jour, int mois, int service, int table) {

        ReservationRestaurant r = new ReservationRestaurant(jour, mois, service, table);

        restaurant.ajouterReservation(r);

        return r;
    }
}