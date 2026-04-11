package tp4;

public class ComptePremium extends Compte {

    private double plafondRetrait;

    public ComptePremium(String numero, String titulaire, double solde, double plafondRetrait) {
        super(numero, titulaire, solde);
        this.plafondRetrait = plafondRetrait;
    }

    @Override
    public void retirer(double montant) {
        if (montant > plafondRetrait) {
            System.out.println("Retrait refusé : plafond dépassé !");
        } else if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Plafond retrait : " + plafondRetrait);
    }
}