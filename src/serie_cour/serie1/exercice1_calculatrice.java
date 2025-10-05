package serie_cour.serie1;

public class exercice1_calculatrice {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Lecture des deux nombres
            System.out.print("Entrez le premier nombre : ");
            double nombre1 = sc.nextDouble();

            System.out.print("Entrez le deuxième nombre : ");
            double nombre2 = sc.nextDouble();

            // Lecture de l’opération
            System.out.print("Entrez l'opération (+, -, *, /) : ");
            char operation = sc.next().charAt(0);

            double resultat;
            boolean operationValide = true;

            // Utilisation de if / else if
            if (operation == '+') {
                resultat = nombre1 + nombre2;
                System.out.println("Le résultat est : " + resultat);
            } else if (operation == '-') {
                resultat = nombre1 - nombre2;
                System.out.println("Le résultat est : " + resultat);
            } else if (operation == '*') {
                resultat = nombre1 * nombre2;
                System.out.println("Le résultat est : " + resultat);
            } else if (operation == '/') {
                if (nombre2 != 0) {
                    resultat = nombre1 / nombre2;
                    System.out.println("Le résultat est : " + resultat);
                } else {
                    System.out.println("Erreur : division par zéro !");
                    operationValide = false;
                }
            } else {
                System.out.println("Opération invalide !");
                operationValide = false;
            }

            sc.close();
        }
}
