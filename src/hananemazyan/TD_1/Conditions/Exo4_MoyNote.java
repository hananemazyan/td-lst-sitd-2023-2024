package hananemazyan.TD_1.Conditions;

import java.util.Scanner;

public class Exo4_MoyNote {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez la moyenne : ");
            double moyenne = scanner.nextDouble();

            if (moyenne >= 16) {
                System.out.println("Très Bien");
            } else if (moyenne >= 14) {
                System.out.println("Bien");
            } else if (moyenne >= 12) {
                System.out.println("Assez Bien");
            } else if (moyenne >= 10) {
                System.out.println("Passable");
            } else {
                System.out.println("Error");}
        }}}