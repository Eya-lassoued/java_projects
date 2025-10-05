package serie_cour.serie2;
import java.util.Scanner;

public class exercice3_rechercheTabStatique  {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Création et initialisation du tableau statique
            int[] tableau = {2, 5, 8, 12, 20};

            // Demande du nombre à rechercher
            System.out.print("Entrez un nombre à rechercher : ");
            int nombreRecherche = sc.nextInt();

            boolean trouve = false;

            // Recherche du nombre dans le tableau
            for (int i = 0; i < tableau.length; i++) {
                if (tableau[i] == nombreRecherche) {
                    trouve = true;
                    break; // on peut sortir de la boucle dès qu'on trouve le nombre
                }
            }

            // Affichage du résultat
            if (trouve) {
                System.out.println("Le nombre " + nombreRecherche + " existe dans le tableau.");
            } else {
                System.out.println("Le nombre " + nombreRecherche + " n'existe pas dans le tableau.");
            }

            sc.close();
        }
    }


