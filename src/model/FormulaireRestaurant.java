package model;

public class FormulaireRestaurant {

    private int jour;
    private int mois;
    private int nbPersonnes;
    private int numService;
    private int identificationEntite;

    private static int compteur = 0;

    public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
        this.jour = jour;
        this.mois = mois;
        this.nbPersonnes = nbPersonnes;
        this.numService = numService;
        this.identificationEntite = compteur;
        compteur++;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getNombrePersonnes() {
        return nbPersonnes;
    }

    public int getNumService() {
        return numService;
    }

    public int getIdentificationEntite() {
        return identificationEntite;
    }

    public void setIdentificationEntite(int id) {
        this.identificationEntite = id;
    }
}