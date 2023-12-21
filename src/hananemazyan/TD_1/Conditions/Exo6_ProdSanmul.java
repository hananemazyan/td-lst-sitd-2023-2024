package hananemazyan.TD_1.Conditions;

import java.util.Scanner;
public class Exo6_ProdSanmul {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Donner un valeur A :");
        int A = scanner.nextInt();
        System.out.print("Donner un valeur B :");
        int B = scanner.nextInt();

        if  ((A > 0 && B > 0 ) || (A < 0 && B < 0 ) ){
            System.out.println("le produit de A et B est positive");
        }
        else {
            System.out.println("le produit de A et B est negative");
        }
    }
    
}
