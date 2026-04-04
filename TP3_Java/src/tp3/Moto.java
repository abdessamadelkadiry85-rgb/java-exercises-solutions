package tp3;

public class Moto extends Vehicule{
	private boolean avecCasque;

	public Moto(String matricule, String marque, boolean avecCasque) {
		super(matricule, marque);
		this.avecCasque=avecCasque;
	}
	
	public void stationner() {
        System.out.println("la moto se garde dans une place reservee aux deux roues.");
    }
	
	public void afficher() {
		super.afficher();
        System.out.println(",avec Casque : "+avecCasque+".");
    }
	
	public boolean isAvecCasque() {
		return avecCasque;
	}

	public void setAvecCasque(boolean avecCasque) {
		this.avecCasque = avecCasque;
	}
}