package model;

import java.util.HashSet;

public class CalendrierAnnuel {

    private HashSet<String> reservations;

    public CalendrierAnnuel() {
        reservations = new HashSet<>();
    }

    public boolean estLibre(int jour, int mois) {
        String date = jour + "/" + mois;
        return !reservations.contains(date);
    }

    public boolean reserver(int jour, int mois) {
        String date = jour + "/" + mois;

        if (reservations.contains(date)) {
            return false;
        }

        reservations.add(date);
        return true;
    }
}