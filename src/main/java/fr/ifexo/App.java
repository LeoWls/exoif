package fr.ifexo;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

            Scanner clavier = new Scanner (System.in);
            int salaireSemaine = 400;
            int prime = 250;
            int quota = 10;

            System.out.println("Entrez le nombre de vente de la semanine");
            int nbVente = clavier.nextInt();

            if (nbVente >= quota){
                salaireSemaine = salaireSemaine + prime;
            }
            System.out.println("Votre salaire est de "+ salaireSemaine);  

    }
}
