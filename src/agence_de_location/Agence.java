package agence_de_location;

import java.util.Scanner;

public class Agence {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // creation d'un objet voiture
        // chaque voiture est caracterisé par les attribut : marque, modele,
        // prixHeure, annee et disponibilité= true par default;
        Voiture v1 = new Voiture("Toyota","yaris",300,2001);

        // Saisie des informations du client;
        System.out.println("Saisir les informations relatives a votre client: ");
        System.out.println("Nom : ");
        String nom = sc.nextLine();
        System.out.println("Prenom : ");
        String prenom = sc.nextLine();
        System.out.println("Adresse : ");
        String adresse = sc.nextLine();
        System.out.println("Age : ");
        int age = sc.nextInt();
        System.out.println("Numero du telephone : ");
        int tel = sc.nextInt();
        Client c1 = new Client(nom,prenom,adresse,age,tel);
        System.out.println("\n\n");

        // Afficher les information du client
        System.out.println("Votre client : \n "+ c1.getNom()+" "+c1.getPrenom()+" "+c1.getAdresse()+" "+c1.getAge()+" "+c1.getTel());
        System.out.println("Cliquer Sur Entrer pour Continuer : ");
        sc.nextLine();
        sc.nextLine();
        System.out.println("ur code is successful");

        // Changement du numero du telephone client
        System.out.println("Voulez Vous changer votre numero de telephone ? \n1 pour Oui \n2 pour non ");
        int changephonenumber;
        changephonenumber=sc.nextInt();
        boolean changephonenum;
        while(changephonenumber != 1 && changephonenumber!=2){
            System.out.println("loop");
        }
        if(changephonenumber==1){
            changephonenum=true;
        }else {
            changephonenum=false;
        }
        if(changephonenum==true){
            System.out.println("Entrer votre nouveau numero : ");
            int newnum = sc.nextInt();
            c1.setTel(newnum);
            System.out.println("Numero telephone enregistré");
        }
        System.out.println("\n\n");

        // Passer la commande
        System.out.println("-----Passer la commande-----");
        System.out.println("Numéro Commande : ");
        int num = sc.nextInt();
        System.out.println("Pour la date de : ");
        String date = sc.nextLine();
        sc.nextLine();
        System.out.println("Pour une duree de : ");
        int duree = sc.nextInt();

        // Créer 1 commande com
        Commande com = new Commande(num,c1,v1,date,duree);

        // Calculer le prix de cette location
        System.out.println(com.calculMontant()+" Da");

        // Mettre a jour la disponibilité
        v1.setDisponibilite(false);





    }
}
