class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}

class Centre extends Point {
    private String nom;

    public Centre(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
    }

    public void affNom() {
        System.out.println("Nom : " + nom);
    }

    public void affiche() {
        super.affCoord();
        affNom();
    }
}

class Cercle extends Centre {
    private double rayon;

    public Cercle(int x, int y, String nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }
}

public class Exo3_Point {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(1, 2, "Cercle A", 3.0);
        cercle.affiche();
        System.out.println("Aire du cercle : " + cercle.calculerAire());
    }
}
