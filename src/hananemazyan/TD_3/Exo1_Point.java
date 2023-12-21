

class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
}

class PointA extends Point {
    public PointA(int x, int y) {
        super(x, y);
    }

    public void affiche() {
        System.out.println("Coordonnées du point : (" + x + ", " + y + ")");
    }
}

public class Exo1_Point {
    public static void main(String[] args) {
        // Utilisation de la classe Point
        Point point = new Point(1, 2);
        point.deplace(3, 4);

        // Utilisation de la classe dérivée PointA
        PointA pointA = new PointA(5, 6);
        pointA.deplace(7, 8);
        pointA.affiche();
    }
}