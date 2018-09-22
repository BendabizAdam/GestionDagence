package agence_de_location;

public class Voiture {

    private String marque;
    private String modele;
    private int prixHeure;
    private int annee;
    private boolean disponibilite = true;

    public Voiture(String marque, String modele, int prixHeure, int annee) {
    this.marque=marque;
    this.modele=modele;
    this.prixHeure=prixHeure;
    this.annee=annee;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public int getPrixHeure() {
        return prixHeure;
    }

    public void setPrixHeure(int prixHeure) {
        this.prixHeure = prixHeure;
    }
}
