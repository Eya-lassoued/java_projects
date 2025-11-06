package serie_cour.seri3;

import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer la premier chaine :");
        String ch1=sc.nextLine();
        System.out.println("entrer la 2eme  chaine :");
        String ch2=sc.nextLine();
        if(ch1.equals(ch2)){
            System.out.println("les chaine sont egaux");

        }
        else {
            System.out.println("les chaine ne sont pas  egaux");
        }
    }
}
