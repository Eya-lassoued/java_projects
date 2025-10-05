package serie_cour.serie2;
import java.util.ArrayList;
import java.util.Scanner;

public class exercice4_fusionTabDynamique{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Création des deux tableaux dynamiques
        ArrayList<Integer> tableau1 = new ArrayList<>();
        ArrayList<Integer> tableau2 = new ArrayList<>();

        System.out.println("Remplissage du premier tableau (tapez 'stop' pour terminer) :");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            try {
                int valeur = Integer.parseInt(input);
                tableau1.add(valeur);
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un entier valide ou 'stop'.");
            }
        }

        System.out.println("Remplissage du deuxième tableau (tapez 'stop' pour terminer) :");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            try {
                int valeur = Integer.parseInt(input);
                tableau2.add(valeur);
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un entier valide ou 'stop'.");
            }
        }

        // Fusion des deux tableaux
        ArrayList<Integer> fusion = new ArrayList<>(tableau1);
        fusion.addAll(tableau2);

        // Affichage du tableau fusionné
        System.out.println("Tableau fusionné : " + fusion);

        sc.close();
    }
}


 
