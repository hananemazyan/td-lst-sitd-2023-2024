package hananemazyan.TD_1.Loop;

import java.util.Scanner;

public class Exo1_Factoriel {
    public static void main (String[]Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre entier naturel :");
        int N = scanner.nextInt();
        int factoriel;

        if (N > 0) {
            System.out.println("Le factoriel n'est pas défini pour les nombres négatifs.");
        }
        else {
            if ( N==0 || N==1 ) {
                factoriel = 1;
            }
            else {

                factoriel=1;
                
                for (int i =2; i <= N ; i++){
                    factoriel *= i ; 
                }
            }
            System.out.println("Le factoriel de " + N + " est : " + factoriel); 
        }
    }
}