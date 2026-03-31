package tp2;

public class TestBanque {

    public static void main(String[] args) {

        // 1. Création banque
        Banque b = new Banque("MarocBank", 1500);

        // 2. Création comptes
        CompteBancaire c1 = new CompteBancaire("Ali", 1000, 500);
        CompteBancaire c2 = new CompteBancaire("Sara", 2000, 300);
        CompteBancaire c3 = new CompteBancaire("Youssef", 1500, 400);

        // 3. Ajouter à la banque
        b.ajouterCompte(c1);
        b.ajouterCompte(c2);
        b.ajouterCompte(c3);

        // 4. Opérations
        c1.deposer(500);
        c1.retirer(1200);
        c2.virementVers(c3, 1000);

        // 5. Affichage
        b.afficherTous();

        // 6. Intérêts
        c2.calculerSoldeAvecInterets();
        c2.calculerSoldeAvecInterets(0.015);

        // 7. Infos globales
        System.out.println("Nombre total de comptes : " + CompteBancaire.getNbComptes());
        System.out.println("Taux d'intérêt : " + CompteBancaire.getTauxInteretAnnuel());
    }
}
