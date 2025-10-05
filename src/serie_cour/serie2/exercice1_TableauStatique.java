package serie_cour.serie2;

public class exercice1_TableauStatique {
        public static void main(String[] args) {
            // Création d'un tableau statique de taille 5
            int[] tableau = new int[5];

            // Remplissage du tableau avec les nombres de 1 à 5
            for (int i = 0; i < tableau.length; i++) {
                tableau[i] = i + 1;
            }

            // Affichage du contenu du tableau
            System.out.print("Contenu du tableau : ");
            for (int i = 0; i < tableau.length; i++) {
                System.out.print(tableau[i] + " ");
            }
        }
}
