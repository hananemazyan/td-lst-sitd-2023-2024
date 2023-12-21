package hananemazyan.TD_1.Tables;

import java.util.Scanner;

public class MatriceSom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Taille des matrices carrées (n x n) : ");
        int taille = scanner.nextInt();

        //  matrice 1
        System.out.println("Saisie de la première matrice :");
        double[][] matrice1 = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print("Matrice1[" + (i + 1) + "][" + (j + 1) + "] : ");
                matrice1[i][j] = scanner.nextDouble();
            }
        }

        //  matrice 2
        System.out.println("Saisie de la deuxième matrice :");
        double[][] matrice2 = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print("Matrice2[" + (i + 1) + "][" + (j + 1) + "] : ");
                matrice2[i][j] = scanner.nextDouble();
            }
        }

        // somme 
        System.out.println("Somme des matrices :");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                double somme = matrice1[i][j] + matrice2[i][j];
                System.out.print(somme + " ");
            }
            System.out.println();
        }

      /* System.out.println("Produit des matrices :");
         for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                double produit = 0;
                for (int k = 0; k < taille; k++) {
                    produit += matrice1[i][k] * matrice2[k][j];
                }
                System.out.print(produit + " ");
            }
            System.out.println();
        }
*/     
}
}