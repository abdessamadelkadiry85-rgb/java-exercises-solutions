package miniprojet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainBibliotheque {

    public static void main(String[] args) {

        // ArrayList livres
        ArrayList<Livre> livres = new ArrayList<>();

        livres.add(new Livre("A1",
                "Java Basics",
                "Ahmed",
                2020));

        livres.add(new Livre("B2",
                "Python AI",
                "Sara",
                2022));

        // HashSet catégories
        HashSet<String> categories =
                new HashSet<>();

        categories.add("Programmation");
        categories.add("IA");
        categories.add("Programmation");

        // HashMap emprunts
        HashMap<String, String> emprunts =
                new HashMap<>();

        emprunts.put("Ali", "Java Basics");
        emprunts.put("Lina", "Python AI");

        // Affichage livres
        System.out.println("Livres :");
        for (Livre l : livres) {
            System.out.println(l);
        }

        // Recherche livre
        System.out.println("\nRecherche :");
        for (Livre l : livres) {
            if (l.getTitre().equals("Python AI")) {
                System.out.println(l);
            }
        }

        // Supprimer livre
        livres.removeIf(
                l -> l.getTitre().equals("Java Basics")
        );

        // Rapport final
        System.out.println("\nRapport Final :");

        System.out.println("Livres disponibles :");
        for (Livre l : livres) {
            System.out.println(l);
        }

        System.out.println("\nCatégories :");
        System.out.println(categories);

        System.out.println("\nEmprunts :");
        System.out.println(emprunts);
    }
}