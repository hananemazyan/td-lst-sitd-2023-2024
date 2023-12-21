package hananemazyan.TD_1.Conditions;
import java.util.Scanner;

public class Exo9_VarCroissant{
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez la première variable : ");
            int a = scanner.nextInt();
            System.out.print("Entrez la deuxième variable : ");
            int b = scanner.nextInt();

            if (a > b) {
                int Ech = a;
                a = b;
                b = Ech;
            }

            System.out.println("Les variables dans l'ordre croissant sont : " + a + " < " + b);
        }
    }
}