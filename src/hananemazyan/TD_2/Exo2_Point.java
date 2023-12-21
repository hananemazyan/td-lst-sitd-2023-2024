import  java.lang.Math;

public class Exo2_Point {

    private double abs,ord;

    public Exo2_Point(){

    }

        public Exo2_Point(double abs, double ord){
             this.abs = abs;
             this.ord = ord;
    }

    public double getAbs(){
        return abs;
    }
    public void setAbs(double abs){
        this.abs = abs;
    }

     public double getOrd(){
        return ord;
    }
    
    public void setOrd(double ord){
        this.ord = ord;
    }

    public double norme() {
        return Math.sqrt(abs * abs + ord * ord );
    }

    public static void main(String[] args){

        Exo2_Point point1 = new Exo2_Point(); 
        Exo2_Point point2 = new Exo2_Point(5.0, 4.0); 

        System.out.println("Point 1 : Abscisse = " + point1.getAbs() + ", Ordonnée = " + point1.getOrd());
        System.out.println("Point 2 : Abscisse = " + point2.getAbs() + ", Ordonnée = " + point2.getOrd());

        System.out.println("Norme de Point 1 : " + point1.norme());
        System.out.println("Norme de Point 2 : " + point2.norme());
    }
    
}
