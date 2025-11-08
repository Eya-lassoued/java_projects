package serie_tp.tp1;

import java.util.Scanner;
public class exercice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // création du scanner
        System.out.println("donner lentier n : ");
        int n = sc.nextInt(); // lecture de l'entier saisi
        int b=n;
        int s=1;
        while (n/10!=0){
            s=s+1;
            n=n/10;
        };int x=1;
        for(int a=1;a<=s;a++){
            x=x*10;
        }
        int n1=0;
        int n2=0;
        for(int a=1;a<=s/2;a++){
            n1=b/x;
            n2=b%x;
        }
        if (n1==n2){System.out.println("le nbr est palindrome");}
        else {System.out.println("le nbr n' est pas  palindrome");}
    }
}