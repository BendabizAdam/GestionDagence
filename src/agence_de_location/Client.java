package agence_de_location;

public class Client {

    private String nom;
    private String prenom;
    private String Adresse;
    private int Age;
    private int Tel;

    Client(String nom, String prenom, String Adresse, int Age, int Tel){
        this.nom= nom;
        this.prenom= prenom;
        this.Adresse= Adresse;
        this.Age= Age;
        this.Tel= Tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }
}
