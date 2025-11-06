package serie_cour.serie2;
import java.util.ArrayList;
import java.util.Scanner;

public class exercice2_TableauDinamique {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> tableau = new ArrayList<String>();
            int i = 0;
            String f;
            do {
                System.out.println("donner l'element" + i);
                f =sc.nextLine()  ;
                tableau.add(i,f);
                i++;
            } while (!f.equals("stop"));
            System.out.println("tableau contient ");
            for (int j = 0; j < tableau.size()-1; j++) {
                System.out.println(tableau.get(j));
            }
            sc.close();
        }
    }




