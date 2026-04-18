package tp5;

public class TestAbonnements {
    public static void main(String[] args) {

        Abonnement[] abonnements = {
            new AbonnementVideo("Netflix", 100, 4, true, true),
            new AbonnementMusique("Play Music", 80, 2, 25, true),
            new AbonnementJeux("Epic Gammes", 120, 1, 60, 50)
        };

        for (Abonnement a : abonnements) {
            a.afficherInfos();
            System.out.println("Cout: " + a.calculerCoutMensuel());
            System.out.println("Score: " + a.calculerScoreSatisfaction());
        }

        Reducible[] reducibles = {
            (Reducible) abonnements[0],
            (Reducible) abonnements[1]
        };

        System.out.println("reduction de 20%");
        for (Reducible r : reducibles) {
            System.out.println(r.appliquerReduction(20));
        }

        System.out.println("reduction de 50% ");
        for (Reducible r : reducibles) {
            System.out.println(r.appliquerReduction(50));
        }
    }
}