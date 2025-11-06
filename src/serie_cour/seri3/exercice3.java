package serie_cour.seri3;
import java.util.Scanner;
public class exercice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre la chaine pricipale ");
        String ch1=sc.nextLine();
        System.out.println("Entre la sous_chaine  a remplacer ");
        String ch2=sc.nextLine();
        System.out.println("Entrer la sous_chaine  qui vas remplacer ");
        String ch3=sc.nextLine();
        String ch4=ch1.replace(ch2,ch3);
        System.out.println("la nouvelle chaine est ch1 "+ch4);
    }
}
