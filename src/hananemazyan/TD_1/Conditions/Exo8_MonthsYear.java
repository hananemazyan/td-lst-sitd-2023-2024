package hananemazyan.TD_1.Conditions;
import java.util.Scanner;

public class Exo8_MonthsYear {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrer le mois : ");
    int month = scanner.nextInt();

    if ( (month == 4) ||(month == 6) ||(month == 9)||(month == 11) ){
        System.out.print("le nombre des jours est 30 ");
    } else if (month == 2) {
        System.out.print("Entrer l'année : ");
        int year = scanner.nextInt();
         
        if (year >= 1900 && year <= 2100) 
        {
            int joursFevrier;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                 joursFevrier = 29;
                } else {
                    joursFevrier = 28;
                }  
                System.out.println("Le nombre des jours en février est : " + joursFevrier);
        }
        
        else {
                    System.out.print("Re-Enter a year between 1900 and 2100 ");

                }
            }
            
            else if ( (month == 1) ||(month == 3) ||(month == 5)||(month == 7) ||(month == 8)||(month == 10) ||(month == 12) ) {
                System.out.println("le nombre des jours est 31 ");
            }
            else {
         System.out.println("Error, make sure to enter a number of month between 1 and 12 ");
        }
    }  
}
