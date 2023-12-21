package hananemazyan.TD_1.Conditions;
import java.util.Scanner ;
public class Exo1_max {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in) ;

        System.out.println("Entre les variables :");
         int var1 = scanner.nextInt();
         int var2 = scanner.nextInt();
         int var3 = scanner.nextInt();
         int max = var1 ;

         if ( var2 > max ){
            max = var2;
         }
         else if ( var3 > max){
            max = var3;
        }
        System.out.println("le maximun entre les 3 variables est : " +max);
    }
}