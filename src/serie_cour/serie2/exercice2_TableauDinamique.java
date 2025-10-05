package serie_cour.serie2;
import java.util.ArrayList;
import java.util.Scanner;

public class exercice2_TableauDinamique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> mots = new ArrayList<>();

        System.out.println("Entrez des mots (tapez 'stop' pour terminer) :");

        while (true) {
            String mot = sc.nextLine();

            if (mot.equalsIgnoreCase("stop")) { // arrêter si l'utilisateur tape "stop"
                break;
            }

            mots.add(mot); // ajouter le mot à la liste
        }

        // Affichage des mots dans l'ordre
        System.out.println("Les mots entrés sont :");
        for (String mot : mots) {
            System.out.println(mot);
        }

        sc.close();
    }
}


