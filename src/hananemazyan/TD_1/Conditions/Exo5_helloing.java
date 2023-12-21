package hananemazyan.TD_1.Conditions;
import java.util.Scanner;

public class Exo5_helloing {
    public static void main (String[] args ){
        Scanner scanner =  new Scanner(System.in);
        int heure = 0;

        while (heure < 0 || heure > 23) {
            System.out.print("Entrez l'heure (en format 24 heures) : ");
            heure = scanner.nextInt();
            
            if (heure < 0 || heure > 23) {
                System.out.println("Heure invalide.");
            }
            
            System.out.print("Entrez la langue (f pour français, a pour anglais) : ");
            
            String message ;
            char langue = scanner.next().charAt(0);
            //.charAt(0) is used to get the first character of that input string.
            
            if (langue == 'f') 
            {
                if (heure >= 0 && heure <= 18) {
                    message = "Bonjour";
                } 
                else if (heure > 18 && heure <= 22) {
                    message = "Bonsoir";
                } else {
                    message = "Bonne nuit";
                }
            } 
            
            else if (langue == 'a')
             {
                if (heure >= 0 && heure <= 18) {
                    message = "Good Morning";
                }
                
                else if (heure > 18 && heure <= 22) {
                    message = "Good Evening";
                } else {
                    message = "Good Night";
                }
            }
             else {
                message = " Langue intouvables ";
            }
            
            System.out.println(message);
        }
    }
}
