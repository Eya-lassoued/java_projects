package serie_cour.serie1;
import java.util.Scanner;

public class exercice2_convertisseurTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demande de la température en Celsius
        System.out.print("Entrez la température en degrés Celsius : ");
        double celsius = sc.nextDouble();

        // Conversion en Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        // Affichage du résultat
        System.out.println(celsius + "°C correspond à " + fahrenheit + "°F");

        sc.close();
    }
}

