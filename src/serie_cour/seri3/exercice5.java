package serie_cour.seri3;
import java.util.Scanner;
public class exercice5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner la chaine a verifier");
        String ch =sc.nextLine();
        String ch2="";
        for (int i=0;i<ch.length();i++){
           ch2=  ch.charAt(i)+ch2;

        }

        if (ch.equals(ch2)){
          System.out.println("la chaine  est palaindromme ");

        }
        else {
          System.out.println("la chaine  n'est pas palaindromme ");
        }
    }
}
