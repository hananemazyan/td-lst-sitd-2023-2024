package  hananemazyan.TD_1.Tables;
import java.util.Random;
public class TabMaxMin {
 public static void main(String[] args) {
    // Definir la taille du tableau we can use the random -
    int [] tab = new int[50]; // création du tableau
    Random r = new Random();

    for(int i = 0; i < 50; i++){
        tab[i]= r.nextInt(100);
    }
    //affichage du tableau 
    for(int i = 0; i < 50; i++){
        System.out.println(tab[i]+"  ");
    }

    int min = tab[0];
    for(int i = 0; i < 50; i++){
      if (tab[i] < min ){
        min = tab[i];
       }
    }
    
    int max = tab[0];
    for(int i = 0; i < 50; i++){
        if (tab[i] < max ){
            max = tab[i];
        }
    }
    System.out.println("Valeur minimale de Tab : " + min);
    System.out.println("Valeur maximale de Tab : " + max);
}
}
