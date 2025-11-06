package serie_cour.seri3;
import java.util.Scanner;
public class exercice4  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" donner La  chaine  ");
        String ch1=sc.nextLine();
       System.out.println(" donner lindidce de debut ");
        int n=sc.nextInt();
        System.out.println(" donner lindidce de fin");
        int m=sc.nextInt();
        String ch2=ch1.substring(n,m+1);
        System.out.println("la nouvelle souschaine est "+ch2);
        sc.close();
    }
}
