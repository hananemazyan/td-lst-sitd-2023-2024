package hananemazyan.TD_1.Loop;

import java.util.Scanner;

public class Exo7_Triangle {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir le nombre de lignes : ");
        int nombreLignes = scanner.nextInt();

        // Affichage du triangle
        for (int i = 1; i <= nombreLignes; i++) {
            // Affichage des chiffres de 1 à i pour chaque ligne
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
