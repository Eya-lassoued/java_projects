package serie_tp.tp1;

import java.util.Scanner;
public class exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // création du scanner
        System.out.println("donner lentier n : ");
        int n = sc.nextInt(); // lecture de l'entier saisi
        int s=0;
        for (int i = 1; i <= n; i++) {
            s=s+i;
        }
        System.out.println("la somme des chiffre est " + s);
    }
}
