package hashmap;

import java.util.HashMap;

public class MainHashMap {

    public static void main(String[] args) {

        HashMap<String, Double> notes = new HashMap<>();

        notes.put("Ali", 14.5);
        notes.put("Sara", 18.0);
        notes.put("Lina", 16.0);

        // Affichage
        System.out.println(notes);

        // Recherche
        System.out.println("\nNote Sara :");
        System.out.println(notes.get("Sara"));

        // Modification
        notes.put("Ali", 15.5);

        // Suppression
        notes.remove("Lina");

        // Moyenne générale
        double somme = 0;

        for (double note : notes.values()) {
            somme += note;
        }

        double moyenne = somme / notes.size();

        System.out.println("\nMoyenne générale : " + moyenne);
    }
}