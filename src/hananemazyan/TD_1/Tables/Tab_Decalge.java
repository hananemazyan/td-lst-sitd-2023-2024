package hananemazyan.TD_1.Tables;

import java.util.Scanner;

public class Tab_Decalge {
    public static void main(String[] args) {
        // Tableau initial
        char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};
          char premierElement = tableau[0];
          
          for (int i = 0; i < tableau.length; i++) {
             System.out.print(tableau[i] + " ");
            }
            System.out.println();

             // Décalage des éléments vers la gauche
             for (int i = 0; i < tableau.length - 1; i++) {
                tableau[i] = tableau[i + 1];
            }
            
            // Remise du premier élément à la fin
            tableau[tableau.length - 1] = premierElement;
             // Affichage du tableau modifié
             System.out.print("Tableau modifié : ");
             
             for (int i = 0; i < tableau.length; i++) {
                System.out.print(tableau[i] + " ");
            }
            System.out.println();
        
    }
}