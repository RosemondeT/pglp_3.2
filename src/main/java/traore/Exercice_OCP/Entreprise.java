package traore.Exercice_OCP;

import java.util.ArrayList;

public class Entreprise {
	ArrayList <Employe> listEmploye;
	ArrayList <Vendeur> listVendeur;
	ArrayList <Manager> listManager;
	
	public double sommeTotale()
	{
		double salaireTotalManager  = 0;
		double salaireTotalVendeur  = 0;
		double salaireTotalEmployer  = 0;
		
		for(int i=0;i < listEmploye.size();i++)
			salaireTotalEmployer+=listEmploye.get(i).calculSalaire();
		
		for(int i=0;i < listVendeur.size();i++)
		salaireTotalVendeur+=listVendeur.get(i).calculSalaireVendeur();	
		
		for(int i=0;i < listManager.size();i++)
		salaireTotalManager+=listManager.get(i).calculSalaireManager();
		
		return   salaireTotalEmployer +  salaireTotalVendeur+ salaireTotalManager;
		}

}
