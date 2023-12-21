class CompteBancaire {
    private int numeroCompte;
    private double solde;
    private String titulaire;

    public CompteBancaire(int numeroCompte, double solde, String titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public void afficherInformations() {
        System.out.println("Numéro de compte : " + numeroCompte);
        System.out.println("Titulaire du compte : " + titulaire);
    }

    public void afficherSolde() {
        System.out.println("Solde du compte : " + solde);
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }
}

public class Exo6_Banque {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(1, 5000.75, "AB 1200");

        System.out.println("Création d'un compte :");
        compte.afficherInformations();
        compte.afficherSolde();

        System.out.println("\nDépôt de 500 :");
        compte.deposer(500);
        compte.afficherInformations();
        compte.afficherSolde();

        System.out.println("\nRetrait de 200 :");
        compte.retirer(200);
        compte.afficherInformations();
        compte.afficherSolde();
    }
}