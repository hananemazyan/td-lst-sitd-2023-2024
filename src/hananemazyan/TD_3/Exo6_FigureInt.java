interface IFigure {
    double getPerimeter();
    double getAire();
}


class Disque implements IFigure {
    private Point centre;
    private double rayon;
    private String nom;

    public Disque(Point centre, double rayon, String nom) {
        this.centre = centre;
        this.rayon = rayon;
        this.nom = nom;
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

    @Override
    public String toString() {
        return "Nom : " + nom;
    }
}


class Rectangle implements IFigure {
    private double longueur;
    private double largeur;
    private String nom;

    public Rectangle(double longueur, double largeur, String nom) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.nom = nom;
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

    @Override
    public String toString() {
        return "Nom : " + nom;
    }
}


public class Exo6_FigureInt {
    public static void main(String[] args) {
        Point centre = new Point(0, 0);
        IFigure disque = new Disque(centre, 5.0, "Disque A");
        IFigure rectangle = new Rectangle(4.0, 3.0, "Rectangle B");

        System.out.println(disque);
        System.out.println("Périmètre du disque : " + disque.getPerimeter());
        System.out.println("Aire du disque : " + disque.getAire());

        System.out.println(rectangle);
        System.out.println("Périmètre du rectangle : " + rectangle.getPerimeter());
        System.out.println("Aire du rectangle : " + rectangle.getAire());
    }
}
