package serie_cour.serie1;
import java.util.Scanner;
import java.util.Random;
public class exercice4_jeuDevinette {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();

            // L'ordinateur choisit un nombre aléatoire entre 1 et 100
            int nombreSecret = rand.nextInt(100) + 1;
            int tentatives = 0;
            int devine = 0;

            System.out.println("Bienvenue au jeu de devinette !");
            System.out.println("L'ordinateur a choisi un nombre entre 1 et 100.");
            System.out.println("Essayez de le deviner !");

            // Boucle jusqu'à ce que le joueur trouve le nombre
            while (devine != nombreSecret) {
                System.out.print("Entrez votre devinette : ");
                devine = sc.nextInt();
                tentatives++;

                if (devine < nombreSecret) {
                    System.out.println("Trop bas !");
                } else if (devine > nombreSecret) {
                    System.out.println("Trop élevé !");
                } else {
                    System.out.println("Félicitations ! Vous avez trouvé le nombre en " + tentatives + " tentatives.");
                }
            }

            sc.close();
        }

}
