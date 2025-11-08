package serie_tp.tp1.tp4;

import java.util.Scanner;

public class exercice7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner la chaine a nettoyer " );
        String n=sc.nextLine();
        int i=0;
        String ch="";
        do{
            if ((n.charAt(i)).equals(n.charAt(i+1))){
               ch= n.replace(n.charAt(i+1),"");
                i++;
            } else if (n.charAt(i)==n.charAt(i-1)) {
                ch= n.replace(n.charAt(i-1),"");
                i++;

            }
            else{
                i++;
            }
        }while (i<n.length());
        System.out.println("la chainne sans doublon est "+ch);
        sc.close();
    }

}
