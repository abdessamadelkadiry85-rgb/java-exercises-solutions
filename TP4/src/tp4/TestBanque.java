package tp4;

public class TestBanque {

    public static void main(String[] args) {
        Compte[] comptes = new Compte[4];

        comptes[0] = new CompteCourant("C001", "Walid", 1000, 500);
        comptes[1] = new CompteEpargne("E001", "Sara", 2000, 0.05);
        comptes[2] = new ComptePremium("P001", "khadija", 3000, 1000);
        comptes[3] = new CompteCourant("C002", "Mounir", 1500, 300);

        for (Compte c : comptes) {
            c.deposer(200);
            c.retirer(400);
            c.afficher();
        }


        System.out.println("Comptes Epargne");
        for (Compte c : comptes) {
            if (c instanceof CompteEpargne) {
                c.afficher();
            }
        }


        Compte c = new CompteEpargne("E002", "Nadia", 5000, 0.04);

        // l'erreur:
        // CompteCourant cc = (CompteCourant) c;

        // la correction :
        if (c instanceof CompteCourant) {
            CompteCourant cc = (CompteCourant) c;
        } else {
            System.out.println("Impossible de caster CompteEpargne en CompteCourant");
        }
    }
}