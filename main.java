import java.io.Console;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nom d'avatar");
        String nom = scanner.nextLine();

        System.out.println("Entrez vos notes");
        List<Double> valeurs = new ArrayList<>();

        // Demander à l'utilisateur de saisir des nombres entiers
        System.out.print("Combien de notes voulez-vous saisir ? ");
        Double n = scanner.nextDouble();

        for (int i = 0; i < n; i++) {
            System.out.print("Saisissez une note : ");
            Double valeur = scanner.nextDouble();
            valeurs.add(valeur);
        }

        // Calculer la somme des valeurs dans la liste
        Double somme = 0.0;
        for (Double valeur : valeurs) {
            somme += valeur;
        }

        // avatar avatar1 = new avatar(nom, somme);
        // avatar avatar2 = new avatar(nom, somme);

        // Afficher la somme
        System.out.println("Votre nombre de point de vie est de : " + somme);

        if (somme == 0) {
            System.out.println("Vous ne pouvez pas lancer de défis.");
        } else {
            System.out.println("Entrez le nombre de question à envoyer : ");
            Integer nbreQuestion = scanner.nextInt();

            console qcm = new console(nbreQuestion);
            qcm.start();
            qcm.displayResultats();
        }

        // modifier les points

        // modifier l'avatar
    }
}
