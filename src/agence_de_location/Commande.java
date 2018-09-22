package agence_de_location;

public class Commande {

    private int num;
    private Client client ;
    private Voiture voiture;
    private String date;
    private int duree;

    public Commande(int num,Client client,Voiture voiture, String date, int duree) {
        this.num=num;
        this.voiture = voiture;
        this.client= client;
        this.date=date;
        this.duree= duree;

    }

    public int calculMontant() {
        return voiture.getPrixHeure()*duree;
    }

}
