package hashsetreeset;

import java.util.HashSet;
import java.util.TreeSet;

public class MainSet {

    public static void main(String[] args) {

        HashSet<String> matieres = new HashSet<>();

        matieres.add("Java");
        matieres.add("Python");
        matieres.add("Reseau");
        matieres.add("Java");

        System.out.println("HashSet :");
        System.out.println(matieres);

        TreeSet<String> tri =
                new TreeSet<>(matieres);

        System.out.println("\nTreeSet trié :");
        System.out.println(tri);
    }
}