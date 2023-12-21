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

class PointNom extends Point {
    private String nom;

    public PointNom(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
    }

    public void setPointNom(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println("Coordonnees : " + x + " " + y);
        System.out.println("Nom : " + nom);
    }
}

public class Exo2_Point {
    public static void main(String[] args) {
        PointNom pn = new PointNom(1, 2, "Point A");
        pn.affCoordNom();

        pn.setPointNom(3, 4, "Point B");
        pn.affCoordNom();

        pn.setNom("Point C");
        pn.affCoordNom();
    }
}
