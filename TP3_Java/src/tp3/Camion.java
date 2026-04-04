package tp3;

public class Camion extends Vehicule{
	
	private double chargeMax;
	
	public Camion(String matricule, String marque, double chargeMax) {
		super(matricule, marque);
		this.chargeMax=chargeMax;
	}
	
	public void stationner() {
        System.out.println("le camion se garde dans une zone pour vehicules lourds.");
    }
	
	public void afficher() {
		super.afficher();
        System.out.println(",charge maximale : "+chargeMax+".");
    }

	public double getChargeMax() {
		return chargeMax;
	}

	public void setChargeMax(double chargeMax) {
		this.chargeMax = chargeMax;
	}

}
