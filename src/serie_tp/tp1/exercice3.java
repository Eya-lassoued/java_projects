package tp1;

import java.util.Scanner;
public class exercice3 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // création du scanner
    System.out.println("donner lentier n : ");
    int n = sc.nextInt(); // lecture de l'entier saisi
    for (int i = 0; i <n; i++){
        if (i%2==0){
            System.out.println(i);
        }
    }
}
}
