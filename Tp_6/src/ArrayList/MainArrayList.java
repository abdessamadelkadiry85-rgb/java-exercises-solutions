package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainArrayList {

    public static void main(String[] args) {

        ArrayList<Etudiant> etudiants = new ArrayList<>();

        // Ajouter étudiants
        etudiants.add(new Etudiant(1, "Ali", 14));
        etudiants.add(new Etudiant(2, "Sara", 17));
        etudiants.add(new Etudiant(3, "Youssef", 12));
        etudiants.add(new Etudiant(4, "Amine", 15));
        etudiants.add(new Etudiant(5, "Lina", 18));

        // Affichage
        System.out.println("Liste des étudiants :");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

        // Recherche par nom
        System.out.println("\nRecherche :");
        for (Etudiant e : etudiants) {
            if (e.getNom().equals("Sara")) {
                System.out.println(e);
            }
        }

        // Supprimer par id
        etudiants.removeIf(e -> e.getId() == 3);

        // Trier par moyenne
        Collections.sort(etudiants,
                Comparator.comparingDouble(Etudiant::getMoyenne));

        System.out.println("\nAprès tri :");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

        // Meilleure moyenne
        Etudiant meilleur =
                Collections.max(etudiants,
                        Comparator.comparingDouble(Etudiant::getMoyenne));

        System.out.println("\nMeilleur étudiant :");
        System.out.println(meilleur);
    }
}