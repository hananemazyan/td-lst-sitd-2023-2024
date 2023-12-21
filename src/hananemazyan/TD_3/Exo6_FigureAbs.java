abstract class Figure {
    private String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double getPerimeter();
    public abstract double getAire();

    @Override
    public String toString() {
        return "Nom : " + nom;
    }
}

class Disque extends Figure {
    private Point centre;
    private double rayon;

    public Disque(Point centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * rayon * rayon;
    }
}


class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }
}


public class Exo6_FigureAbs {
    public static void main(String[] args) {
        Point centre = new Point(0, 0);
        Disque disque = new Disque(centre, 5.0, "Disque A");
        Rectangle rectangle = new Rectangle(4.0, 3.0, "Rectangle B");

        System.out.println(disque);
        System.out.println("Périmètre du disque : " + disque.getPerimeter());
        System.out.println("Aire du disque : " + disque.getAire());

        System.out.println(rectangle);
        System.out.println("Périmètre du rectangle : " + rectangle.getPerimeter());
        System.out.println("Aire du rectangle : " + rectangle.getAire());
    }
}
