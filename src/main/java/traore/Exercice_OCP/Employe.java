package traore.Exercice_OCP;

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


	public double calculSalaire () 
		{ 
		   if(anciennete!=0) {
			  double salaire=salaire_de_base+anciennete*20;
			  return salaire;
		   }
		   
			return salaire_de_base ; 
			
		} 
		public void afficheCoordonneees () {
			System.out. println (nom + " , " + adresse);
		}
		
}
