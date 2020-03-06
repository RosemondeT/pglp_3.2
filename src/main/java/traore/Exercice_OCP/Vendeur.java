package traore.Exercice_OCP;

import traore.Exercice_OCP.Employe;

/**
 * Classe Vendeur qui est une classe fille de la classe Employe
 */
public class Vendeur extends Employe{
	protected double commission;
	
	public Vendeur(String nom, String adresse, int an, double commission) {
		super(nom,adresse,an);
		this.commission=commission;
	}
	
	/**
     * Méthode calculSalaireVendeur ()
     * 
     * @return le salaire d'un vendeur.
     */
	public double calculSalaireVendeur() {
		return super.calculSalaire() + commission;
	}
	
	public void afficheCoordonneees () {
		super.afficheCoordonneees();
	}

}

