package hananemazyan.TD_1.Loop;

import java.util.Scanner;

public class Exo4_Pgcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le premier entier a : ");
        int a = scanner.nextInt();
        
        System.out.print("Entrez le deuxième entier b : ");
        int b = scanner.nextInt();

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("The PGCD is: " + a);
    }
}