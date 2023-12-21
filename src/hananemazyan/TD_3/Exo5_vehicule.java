class Vehicule {
    private int nbPassager;

    public Vehicule(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    @Override
    public String toString() {
        return "Nombre de passagers : " + nbPassager;
    }
}

class Moto extends Vehicule {
    private int nbRoues = 2;

    public Moto(int nbPassager) {
        super(nbPassager);
    }
}

class Avion extends Vehicule {
    private int nbMoteur;

    public Avion(int nbPassager, int nbMoteur) {
        super(nbPassager);
        this.nbMoteur = nbMoteur;
    }
}

class Triporteur extends Moto {
    public Triporteur(int nbPassager) {
        super(nbPassager);
    }
}
