package model;

public class ReservationRestaurant {

    private int jour;
    private int mois;
    private int service;
    private int table;

    public ReservationRestaurant(int jour, int mois, int service, int table) {
        this.jour = jour;
        this.mois = mois;
        this.service = service;
        this.table = table;
    }

    public int getJour() { return jour; }
    public int getMois() { return mois; }
    public int getService() { return service; }
    public int getTable() { return table; }

    @Override
    public String toString() {
        String type = (service == 1) ? "premier" : "deuxième";
        return "Le " + jour + "/" + mois + "\nTable " + table + " pour le " + type + " service.";
    }
}