package model;

import java.util.ArrayList;

public class Restaurant {

    private ArrayList<Integer> tables;

    public Restaurant() {
        tables = new ArrayList<>();
    }

    public void ajouterTable(int nbPlaces) {
        tables.add(nbPlaces);
    }

    public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
        int nb = formulaire.getNombrePersonnes();

        int[] res = new int[tables.size()];
        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i) >= nb) {
                res[i] = tables.get(i);
            } else {
                res[i] = 0;
            }
        }
        return res;
    }

    public ReservationRestaurant reserver(int tableChoisie, FormulaireRestaurant formulaire) {
        return new ReservationRestaurant(
            formulaire.getJour(),
            formulaire.getMois(),
            formulaire.getNumService(),
            tableChoisie
        );
    }
}