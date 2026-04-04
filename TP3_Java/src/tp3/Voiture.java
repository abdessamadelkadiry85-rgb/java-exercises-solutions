package tp3;

public class Voiture extends Vehicule{
	private int nbPortes;

	public Voiture(String matricule, String marque, int nbPortes) {
		super(matricule, marque);
		this.nbPortes=(nbPortes);
	}
	
	public void stationner() {
        System.out.println("la voiture se garde dans une place standard.");
    }
	
	public void afficher() {
		super.afficher();
        System.out.println(",nombre de portes : "+nbPortes+".");
    }

	public int getNbPortes() {
		return nbPortes;
	}

	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}

}
