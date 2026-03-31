package tp2;

public class CompteBancaire {

    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;

    private static int nbComptes = 0;
    private static double tauxInteretAnnuel = 0.03;

    // Constructeur par défaut
    public CompteBancaire() {
        nbComptes++;
        this.numero = nbComptes;
        this.titulaire = "inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

    // Constructeur paramétré
    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
        nbComptes++;
        this.numero = nbComptes;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

    // Getters & Setters
    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isEmpty()) {
            this.titulaire = titulaire;
        }
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        if (decouvertAutorise >= 0) {
            this.decouvertAutorise = decouvertAutorise;
        }
    }

    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public static void setTauxInteretAnnuel(double taux) {
        tauxInteretAnnuel = taux;
    }

    // Affichage
    public void afficher() {
        System.out.println("Compte N°: " + numero +
                " | Titulaire: " + titulaire +
                " | Solde: " + solde +
                " | Découvert: " + decouvertAutorise);
    }

    // Déposer
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }

    // Retirer
    public void retirer(double montant) {
        if (montant > 0 && (solde - montant) >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Retrait refusé.");
        }
    }

    // Virement
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && (solde - montant) >= -decouvertAutorise) {
            this.retirer(montant);
            autre.deposer(montant);
        } else {
            System.out.println("Virement impossible : montant ou solde insuffisant.");
        }
    }

    // Intérêts sans bonus
    public double calculerSoldeAvecInterets() {
        solde += solde * tauxInteretAnnuel;
        return solde;
    }

    // Intérêts avec bonus
    public double calculerSoldeAvecInterets(double bonus) {
        solde += solde * (tauxInteretAnnuel + bonus);
        return solde;
    }
}
