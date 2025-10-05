package serie_cour.serie1;
import java.util.Scanner;
public class exercice3_factorielle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Demande de l'entier positif
    System.out.print("Entrez un entier positif : ");
    int n = sc.nextInt();

    // Vérification que l'entier est positif
    if (n < 0) {
        System.out.println("Erreur : l'entier doit être positif !");
    } else {
        long factorielle = 1; // utiliser long pour gérer de grands nombres

        // Calcul de la factorielle
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }

        // Affichage du résultat
        System.out.println("La factorielle de " + n + " est : " + factorielle);
    }

    sc.close();
}
}
