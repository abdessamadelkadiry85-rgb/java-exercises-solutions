package tp4;

public class CompteEpargne extends Compte {

    private double tauxInteret;

    public CompteEpargne(String numero, String titulaire, double solde, double tauxInteret) {
        super(numero, titulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
        solde += solde * tauxInteret;
    }

    @Override
    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Retrait refusé : solde insuffisant.");
        }
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Taux intérêt : " + tauxInteret);
    }
}