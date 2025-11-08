package serie_tp.tp1.tp4;

import java.util.Scanner;

public class exercice5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner la chaine ");
        String ch =sc.nextLine();
        String ch1=ch.replace(" ","-");
        System.out.println("la nouvelle chaine est "+ch1);

    }
}
