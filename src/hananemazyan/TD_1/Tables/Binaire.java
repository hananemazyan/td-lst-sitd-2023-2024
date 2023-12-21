 package hananemazyan.TD_1.Tables;
import java.util.Scanner;

public class Binaire {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print(" entrer un entier N : ");
        int N = scanner.nextInt();

        System.out.print("Représentation binaire de " + N + " : ");

        // Utilisation d'un indicateur pour détecter le début significatif des bits
        // Ce booléen indique si nous avons déjà trouvé un bit significatif,
        // permettant ainsi de ne pas afficher les zéros non significatifs en début de la représentation binaire.
        
        boolean isSignificantBitFound = false; 
    

        for (int i = 31; i >= 0; i--) {
            int bit = (int) (N / Math.pow(2, i)) % 2;

            if (bit == 1 || isSignificantBitFound) {
                System.out.print(bit);
                isSignificantBitFound = true;
        }
    }
}
}