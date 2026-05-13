package treemap;

import java.util.TreeMap;

public class MainTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> etudiants =
                new TreeMap<>();

        etudiants.put(101, "Ali");
        etudiants.put(99, "Sara");
        etudiants.put(150, "Lina");
        etudiants.put(120, "Amine");

        // Liste triée
        System.out.println(etudiants);

        // Premier et dernier
        System.out.println("\nPremier :");
        System.out.println(etudiants.firstEntry());

        System.out.println("\nDernier :");
        System.out.println(etudiants.lastEntry());

        // Supérieur à 100
        System.out.println("\nNuméros > 100 :");
        System.out.println(etudiants.tailMap(100));
    }
}