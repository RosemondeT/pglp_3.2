package traore.Exercice_OCP;

import traore.Exercice_OCP.Employe;

public class Vendeur extends Employe{
	protected double commission;
	
	public Vendeur(String nom, String adresse, int an, double commission) {
		super(nom,adresse,an);
		this.commission=commission;
	}
	
	public double calculSalaire() {
		return super.calculSalaire() + commission;
	}
	
	public void afficheCoordonneees () {
		super.afficheCoordonneees();
	}

}

