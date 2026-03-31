package tp2;

public class Banque {

    private String nom;
    private CompteBancaire[] comptes;
    private int nbActuels;

    public Banque(String nom, int capacite) {
        this.setNom(nom);
        this.comptes = new CompteBancaire[capacite];
        this.nbActuels = 0;
    }

    public void ajouterCompte(CompteBancaire c) {
        if (nbActuels < comptes.length) {
            comptes[nbActuels] = c;
            nbActuels++;
        } else {
            System.out.println("Banque pleine !");
        }
    }

    public void afficherTous() {
        for (int i = 0; i < nbActuels; i++) {
            comptes[i].afficher();
        }
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
