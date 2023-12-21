
class Exo4_Temps {
    private int heures;
    private int minutes;
    private int secondes;

    public Exo4_Temps() {
        this.heures = 0;
        this.minutes = 0;
        this.secondes = 0;
    }

    public Exo4_Temps(int heures) {
        this.heures = heures;
        this.minutes = 0;
        this.secondes = 0;
    }

    // Constructeur avec heures et minutes
    public Exo4_Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = 0;
    }

    // Constructeur avec heures, minutes et secondes
    public Exo4_Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    public Exo4_Temps(Exo4_Temps temps) {
        this.heures = temps.heures;
        this.minutes = temps.minutes;
        this.secondes = temps.secondes;
    }

    // Accesseurs et mutateurs
    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    // Méthodes pour ajouter heures, minutes et secondes
    public void ajouterHeures(int heures) {
        this.heures = (this.heures + heures) % 24;
    }

    public void ajouterMinutes(int minutes) {
        int totalMinutes = this.heures * 60 + this.minutes + minutes;
        this.heures = (totalMinutes / 60) % 24;
        this.minutes = totalMinutes % 60;
    }

    public void ajouterSecondes(int secondes) {
        int totalSecondes = this.heures * 3600 + this.minutes * 60 + this.secondes + secondes;
        this.heures = (totalSecondes / 3600) % 24;
        this.minutes = (totalSecondes / 60) % 60;
        this.secondes = totalSecondes % 60;
    }

    // Méthode toString() pour afficher les informations sur le temps
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }


    public static void main(String[] args) {
        Exo4_Temps temps1 = new Exo4_Temps();
        Exo4_Temps temps2 = new Exo4_Temps(8);
        Exo4_Temps temps3 = new Exo4_Temps(14, 30);
        Exo4_Temps temps4 = new Exo4_Temps(18, 45, 25);
        Exo4_Temps temps5 = new Exo4_Temps(temps4);

        System.out.println(temps1.toString());
        System.out.println(temps2.toString());
        System.out.println(temps3.toString());
        System.out.println(temps4.toString());
        System.out.println(temps5.toString());

        temps1.ajouterHeures(5);
        temps2.ajouterMinutes(45);
        temps3.ajouterSecondes(120);
        temps4.ajouterHeures(3);

        System.out.println("Après ajout de temps :");
        System.out.println(temps1.toString());
        System.out.println(temps2.toString());
        System.out.println(temps3.toString());
        System.out.println(temps4.toString());
    }
}
