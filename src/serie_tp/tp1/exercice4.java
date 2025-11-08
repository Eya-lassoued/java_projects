package serie_tp.tp1;

import java.util.Scanner;
public class exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // création du scanner
        System.out.println("donner lentier n : ");
        int n = sc.nextInt(); // lecture de l'entier saisi
        int s=1;
        while (n/10!=0){
            s=s+1;
            n=n/10;
        };
System.out.print("le nbr de chiffre de n est : "+s);}}