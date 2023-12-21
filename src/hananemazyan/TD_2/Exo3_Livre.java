public class Exo3_Livre {

    private String titre;
    private String auteur;
    private double prix;
    private int annee;

    
    public Exo3_Livre() {
    }

    public Exo3_Livre(String titre) {
        this.titre = titre;
    }

    public Exo3_Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public Exo3_Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public Exo3_Livre(String titre, String auteur, double prix, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
    }

    public Exo3_Livre(Exo3_Livre livre) {
        // Copy_constructor
        this.titre = livre.titre;
        this.auteur = livre.auteur;
        this.prix = livre.prix;
        this.annee = livre.annee;
    }

    // setter Getter
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // toString method
    @Override
    public String toString() {
        return "Title: " + titre +
        ", Author: " + auteur +
        ", Price: " + prix +
        ", Year: " + annee;
    }

 
        public static void main(String[] args) {
            Exo3_Livre livre1 = new Exo3_Livre("Titre1", "Auteur1", 29.99, 2022);
            Exo3_Livre livre2 = new Exo3_Livre("Titre2", "Auteur2");
    
            System.out.println("Exo3_Livre 1: " + livre1.toString());
            System.out.println("Exo3_Livre 2: " + livre2.toString());
    
            livre2.setPrix(19.99);
            System.out.println("Updated Exo3_Livre 2: " + livre2.toString());
        }
    }
