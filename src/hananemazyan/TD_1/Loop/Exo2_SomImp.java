package hananemazyan.TD_1.Loop;

import java.util.Scanner;
public class Exo2_SomImp {
    public static void main (String[]Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre entier naturel :");
        int N = scanner.nextInt();
        int somme = 0;
        for (int i = 1; i < N; i += 2) {
             somme += i;
        }
         System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + somme);
        }
    }
