
class Exo5_Rectangle {
    private double longueur;
    private double largeur;

    public Exo5_Rectangle() {
        this.longueur = 0;
        this.largeur = 0;
    }

    public Exo5_Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Exo5_Rectangle(Exo5_Rectangle rectangle) {
        this.longueur = rectangle.longueur;
        this.largeur = rectangle.largeur;
    }

    // Accesseurs et mutateurs (avec vérification que les valeurs sont positives)
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        }
    }

    // Méthode pour calculer le périmètre du rectangle
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    // Méthode pour calculer l'aire du rectangle
    public double aire() {
        return longueur * largeur;
    }

    // Méthode pour vérifier si le rectangle est un carré
    public boolean isCarre() {
        return longueur == largeur;
    }

    // Méthode toString() pour afficher les informations sur le rectangle
    public String toString() {
        return "Rectangle" +
                "longueur=" + longueur +
                ", largeur=" + largeur 
        ;
    }



    public static void main(String[] args) {
        Exo5_Rectangle rectangle1 = new Exo5_Rectangle();
        Exo5_Rectangle rectangle2 = new Exo5_Rectangle(5, 10);
        Exo5_Rectangle rectangle3 = new Exo5_Rectangle(rectangle2);

        System.out.println("Rectangle 1 : " + rectangle1.toString());
        System.out.println("Rectangle 2 : " + rectangle2.toString());
        System.out.println("Rectangle 3 : " + rectangle3.toString());

        rectangle1.setLongueur(3);
        rectangle1.setLargeur(3);

        System.out.println("Rectangle 1 (après modification) : " + rectangle1.toString());
        System.out.println("Périmètre du rectangle 1 : " + rectangle1.perimetre());
        System.out.println("Aire du rectangle 1 : " + rectangle1.aire());
        System.out.println("Est-ce que le rectangle 1 est un carré ? " + rectangle1.isCarre());
    }
}
