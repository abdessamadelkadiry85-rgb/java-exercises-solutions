package LinkedList;

import java.util.LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {

        LinkedList<Client> file = new LinkedList<>();

        file.add(new Client(1, "Ali"));
        file.add(new Client(2, "Sara"));
        file.add(new Client(3, "Amine"));

        System.out.println("File actuelle :");
        for (Client c : file) {
            System.out.println(c);
        }

        // Servir premier client
        file.removeFirst();

        // Ajouter nouveau client
        file.addLast(new Client(4, "Lina"));

        System.out.println("\nAprès modifications :");
        for (Client c : file) {
            System.out.println(c);
        }

        // Tête de file
        System.out.println("\nPremier client :");
        System.out.println(file.getFirst());
    }
}
