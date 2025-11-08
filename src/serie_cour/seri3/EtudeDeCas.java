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

         System.out.println("nom d'utilisateur");
         System.out.println("n=");
         String n =sc.nextLine();
         System.out.println("prenom d'utilisateur");
         String p =sc.nextLine();
         System.out.println(" age d'utilisateur");
         int a=sc.nextInt();
        utilisateur u=new utilisateur(n,p,a);
         list.add(u);
     }
     for(utilisateur u:list){
         System.out.println(u.getNom()+" "+u.getPrenom()+" "+ u.getAge()) ;

     }

    }
}
class utilisateur{
     private String nom;
    private String prenom;
    private int age;
public String getNom() {
    return nom;
}
public void setNom(String nom) {
    this.nom = nom;
}
public String getPrenom() {
    return prenom;
}
public void setPrenom(String prenom) {
    this.prenom = prenom;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public utilisateur(String n, String p, int a) {
    this.nom=n;
    this.prenom=p;
    this.age=a;
}
}