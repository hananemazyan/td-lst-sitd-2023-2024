


public class Exo1_Point{
private char nom ;
private double abscisse ;
 
public Exo1_Point(char nom, double abscisse){
this.nom = nom ;
this.abscisse = abscisse;
}
//public Point(char pointNom, double pointAbscisse) {
//  nom = pointNom;
//   abscisse = pointAbscisse;
// if i dont want to use this i can use diffrent prametre names}

public void affiche(){
    System.out.println("le point nom est "+nom +"son abscssie est "+abscisse);
}
public void translate(double valeur) {
    abscisse += valeur;
}

public static void main(String[] args) {
    Exo1_Point point1 = new Exo1_Point('A',3.5);

    point1.affiche();
    point1.translate(2.0);
    System.out.println("Apres la translation ");
    point1.affiche();

}
}
