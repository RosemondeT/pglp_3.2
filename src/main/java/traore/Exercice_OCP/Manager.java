package traore.Exercice_OCP;

/**
 * Classe Manager qui est une classe fille de la classe Employe
 */

public class Manager extends Employe {

	
	public Manager(String nom, String adresse, int an) {
		super(nom,adresse,an);
	}
	
	/**
     * Méthode calculSalaireManager ()
     * 
     * @return le salaire d'un Manager.
     */
	public double calculSalaireManager() {
		return super.calculSalaire() + 100;
	}
	
	public void afficheCoordonneees () {
		super.afficheCoordonneees();
	}


}
