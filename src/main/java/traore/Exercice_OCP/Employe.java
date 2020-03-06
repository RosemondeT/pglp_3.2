package traore.Exercice_OCP;

/**
 * Classe Employe qui possède deux méthode à savoir calculSalaire() et afficheCoordonneees()
 */
public class Employe {
	protected final String nom;
	protected final String adresse;
	protected final double salaire_de_base=1500;
	protected int anciennete;

	public Employe(String nom, String adresse, int anciennete) {
		this.nom=nom;
		this.adresse= adresse;
		this.anciennete=anciennete;
	}


	/**
     * Méthode calculSalaire ()
     * 
     * @return le salaire de l'employe.
     */
	public double calculSalaire () 
		{ 
		   if(anciennete!=0) {
			  double salaire=salaire_de_base+anciennete*20;
			  return salaire;
		   }
		   
			return salaire_de_base ; 
			
		} 
	

/**
 * Méthode afficheCoordonneees () qui affiche les coordonnées de l'employe
 */
		public void afficheCoordonneees () {
			System.out. println (nom + " , " + adresse);
		}
		
}
