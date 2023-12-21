package hananemazyan.TD_1.Conditions;
import java.util.Scanner;
import java.lang.Math;
public class Exo2_Equation {
    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer les parametre de l'equation");
        System.out.print("a =");
        int a = scanner.nextInt();
        System.out.print("b =");
        int b = scanner.nextInt();
        System.out.print("c =");
        int c = scanner.nextInt();

        double delta = Math.pow(b, 2)-4 * a * c ;

        if ( delta == 0 ){
            double sol = -b/2*a;
            System.out.println("La solution est :"+sol);
        }
        else if ( delta >= 0){
            double sol1 = (-b-Math.sqrt(delta))/(2*a);
            double sol2 = (-b+Math.sqrt(delta))/(2*a);

            System.out.println("La solution est solution 1 :"+sol1);
            System.out.println("La solution est solution 2 :"+sol2);
        } 
         else {
             double partiereel = -b/(2*a);
             double partieimaginaire = Math.sqrt(-delta)/(2*a);             
            System.out.println("La solution est :  solution 1 :" + partiereel + "+" + partieimaginaire + "i");
            System.out.println("La solution est :  solution 2 :" + partiereel + "-" + partieimaginaire + "i");
     }
}
}