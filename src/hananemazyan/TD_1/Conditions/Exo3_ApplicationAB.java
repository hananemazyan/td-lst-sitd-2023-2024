package hananemazyan.TD_1.Conditions;
import java.util.Scanner;

public class Exo3_ApplicationAB {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier a :");
        int a = scanner.nextInt();

        System.out.print("Entrez un nombre entier b :");
        int b = scanner.nextInt();

        System.out.println("choisir une choix :");
        System.out.println("la somme de a + b est pair ? :");
        System.out.println("le produit de a * b est pair ? :");
        System.out.println("la signe de la somme a + b :");
        System.out.println("la signe de produit a * b :");

        int choix = scanner.nextInt();


        switch (choix){

            case 1:
                  System.out.println("La somme a + b est paire :" + ((a + b) % 2 == 0));
                  break;
            case 2:
                  System.out.println("Le produit a * b est paire :" + ((a * b) % 2 == 0));
                  break;  
             case 3:
                  int somme = a + b;
                  System.out.println("Le signe de la somme a + b est : " + (somme > 0 ? "positif" : (somme < 0 ? "négatif" : "nul")));
                  break;

            case 4:
                  int produit = a * b;
                  System.out.println("Le signe de le produit a * b est : " + (produit > 0 ? "positif" : (produit < 0 ? "négatif" : "nul")));
                  break;

        default: 
                 System.out.println("ce choix n'est pas dans la list ");
                 break;
        }
        }
    }