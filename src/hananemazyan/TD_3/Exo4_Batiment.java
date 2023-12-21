// Classe de base représentant un bâtiment
class Batiment {
    private String adresse; // Attribut pour stocker l'adresse du bâtiment

    // Constructeur par défaut
    public Batiment() {
        this.adresse = "";
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode toString pour obtenir une représentation du bâtiment
    @Override
    public String toString() {
        return "Adresse du bâtiment : " + adresse;
    }
}

// Classe dérivée représentant une maison
class Maison extends Batiment {
    private int nbChambres; // Attribut pour stocker le nombre de chambres de la maison

    // Constructeur par défaut
    public Maison() {
        super(); // Appel du constructeur de la classe de base
        this.nbChambres = 0;
    }

    // Constructeur avec adresse et nombre de chambres en paramètres
    public Maison(String adresse, int nbChambres) {
        super(adresse); // Appel du constructeur de la classe de base avec l'adresse
        this.nbChambres = nbChambres;
    }

    // Accesseurs et mutateurs pour le nombre de chambres
    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    // Méthode toString pour obtenir une représentation de la maison
    @Override
    public String toString() {
        return super.toString() + ", Nombre de chambres : " + nbChambres;
    }
}

// Classe dérivée représentant un immeuble
class Immeuble extends Batiment {
    private int nbAppart; // Attribut pour stocker le nombre d'appartements de l'immeuble

    // Constructeur par défaut
    public Immeuble() {
        super(); // Appel du constructeur de la classe de base
        this.nbAppart = 0;
    }

    // Constructeur avec adresse et nombre d'appartements en paramètres
    public Immeuble(String adresse, int nbAppart) {
        super(adresse); // Appel du constructeur de la classe de base avec l'adresse
        this.nbAppart = nbAppart;
    }

    // Accesseurs et mutateurs pour le nombre d'appartements
    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    // Méthode toString pour obtenir une représentation de l'immeuble
    @Override
    public String toString() {
        return super.toString() + ", Nombre d'appartements : " + nbAppart;
    }
}

// Classe de test pour tester les classes Batiment, Maison et Immeuble
public class Exo4_Batiment {
    public static void main(String[] args) {
        // Test de la classe Maison
        Maison maMaison = new Maison("123 Rue de la Maison", 3);
        System.out.println(maMaison.toString());

        // Test de la classe Immeuble
        Immeuble monImmeuble = new Immeuble("456 Rue de l'Immeuble", 10);
        System.out.println(monImmeuble.toString());
    }
}
