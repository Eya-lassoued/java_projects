package serie_cour.seri3;

import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer la premier chaine :");
        String ch1=sc.nextLine();
        System.out.println("entrer la 2eme  chaine :");
        String ch2=sc.nextLine();
        String ch3=ch1+ch2;
        System.out.println("la concatenation des deux chaine est :"+ch3);
    }
}
