package Exceptions;

public class Main {

    // Partie 1

    public static double effectuerPaiement(double montant, double solde) {

        if (montant <= 0) {
            throw new IllegalArgumentException(
                    "Le montant doit être supérieur à 0");
        }

        if (montant > solde) {
            throw new ArithmeticException(
                    "Solde insuffisant");
        }

        return solde - montant;
    }

    // Partie 2
    
    public static double lireMontant(String valeur) {

        try {

            double montant = Double.parseDouble(valeur);

            if (montant < 0) {
                throw new IllegalArgumentException(
                        "Montant négatif interdit");
            }

            return montant;

        } catch (NumberFormatException e) {

            System.out.println(
                    "Erreur : valeur non numérique");

        } catch (IllegalArgumentException e) {

            System.out.println(
                    e.getMessage());
        }

        return 0;
    }


    // Partie 3
    
    public static double lireMontant2(String valeur)
            throws NumberFormatException,
            IllegalArgumentException {

        double montant = Double.parseDouble(valeur);

        if (montant < 0) {
            throw new IllegalArgumentException(
                    "Montant négatif interdit");
        }

        return montant;
    }


    // Partie 4

    public static double lireTransaction(
            double[] tab,
            int index) {

        return tab[index];
    }


    // MAIN
    public static void main(String[] args) {

        // Partie 1

        System.out.println("===== Partie 1 =====");

        try {

            double nouveauSolde =
                    effectuerPaiement(500, 1000);

            System.out.println(
                    "Nouveau solde : "
                            + nouveauSolde);

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Erreur montant : "
                            + e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println(
                    "Erreur paiement : "
                            + e.getMessage());

        } finally {

            System.out.println(
                    "Fin de la transaction");
        }


        // Partie 2

        System.out.println("\n===== Partie 2 =====");

        double montant =
                lireMontant("200");

        System.out.println(
                "Montant lu : " + montant);


        // Partie 3

        System.out.println("\n===== Partie 3 =====");

        try {

            double m =
                    lireMontant2("-10");

            System.out.println(m);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Valeur invalide");

        } catch (IllegalArgumentException e) {

            System.out.println(
                    e.getMessage());
        }

        // Partie 4

        System.out.println("\n===== Partie 4 =====");

        double[] transactions =
                {100, 200, 300};

        try {

            double t =
                    lireTransaction(
                            transactions,
                            1);

            System.out.println(
                    "Transaction : " + t);

        } catch (
                ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Index invalide");

        } catch (
                NullPointerException e) {

            System.out.println(
                    "Tableau null");
        }

    }
}