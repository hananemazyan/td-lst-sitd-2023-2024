abstract class Employe {
    private String nom;
    private String prenom;

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double gains();

    @Override
    public String toString() {
        return "Nom : " + nom + ", Prénom : " + prenom;
    }
}

class Patron extends Employe {
    private double salaire;

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public double gains() {
        return salaire;
    }
}

class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = 0;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }
}


class TravailleurHoraire extends Employe {
    private double retribution;
    private double heures;

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
        this.heures = 0.0;
    }

    public double getHeures() {
        return heures;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }

    @Override
    public double gains() {
        return retribution * heures;
    }
}


public class Exo7_EmployerAbs {
    public static void main(String[] args) {
        Patron patron = new Patron("Doe", "John", 5000.0);
        TravailleurCommission travailleurCommission = new TravailleurCommission("Smith", "Alice", 1000.0, 10.0);
        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("Brown", "Bob", 20.0);

        travailleurCommission.setQuantite(50);
        travailleurHoraire.setHeures(160);

        System.out.println(patron);
        System.out.println("Salaire du patron : " + patron.gains());

        System.out.println(travailleurCommission);
        System.out.println("Salaire du travailleur à la commission : " + travailleurCommission.gains());

        System.out.println(travailleurHoraire);
        System.out.println("Salaire du travailleur horaire : " + travailleurHoraire.gains());
    }
}
