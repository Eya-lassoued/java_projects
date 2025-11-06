package serie_cour.seri3;
import java.util.Scanner;
import java.util.ArrayList;
public class EtudeDeCas {
    public  static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     ArrayList<utilisateur>list=new ArrayList<>();
     System.out.println("choisir l'opperation a faire ");
     String op=sc.next();
     if(op.equals("cree")){
         utilisateur u=new utilisateur();
         System.out.println("nom d'utilisateur");
         u.nom=sc.next();
         System.out.println("prenom d'utilisateur");
         u.prenom=sc.next();
         System.out.println(" age d'utilisateur");
         u.age=sc.nextInt();
         list.add(u);
     }
     for(utilisateur u:list){
         System.out.println(u.nom+" "+u.prenom+" "+u.age);

     }

    }
}
class utilisateur{
    String nom;
    String prenom;
    int age;


}