package hananemazyan.TD_1.Tables;
import java.util.Scanner;

public class TabMoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclaration et initialisation remplissage  du tableau
        System.out.print("Nombre d'étudiants : ");
        int numStudent = scanner.nextInt();

        double[] moyennes = new double[numStudent];

        System.out.print("Seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        for (int i = 0 ; i < numStudent; i++) {
            System.out.print("Moyenne de l'étudiant " + (i+1) + " : ");
            moyennes[i] = scanner.nextDouble();
        }

        int numStudentSupSeuil = 0;
        for (int i = 0; i < numStudent; i++) {
            if (moyennes[i] >= seuil) {
                numStudentSupSeuil++;
            }
        }
        
       
        System.out.println("Nombre d'étudiants ayant une moyenne supérieure ou égale au seuil : " + numStudentSupSeuil);

    }
}