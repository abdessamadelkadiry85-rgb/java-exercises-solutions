package tp3;

public class TestParking {

    public static void main(String[] args) {

        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("A123", "Toyota", 4);
        v[1] = new Voiture("B456", "BMW", 2);
        v[2] = new Moto("C789", "Yamaha", true);
        v[3] = new Camion("D111", "Volvo", 10000);

        for (Vehicule vehicule : v) {
        	vehicule.stationner();
        	vehicule.afficher();
        }

        for (Vehicule vehicule : v) {
            if (vehicule instanceof Voiture) {
            	vehicule.afficher();
            }
        }

        Vehicule x = new Moto("11C22", "Yamaha", true);

        //version fauce  
        // Voiture v1 = (Voiture) x;
        //System.out.println("Downcasting réussi !");
        
        // version corrigee 
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("genere une erreur: impossible de caster Moto vers Voiture");
        }
    }
}