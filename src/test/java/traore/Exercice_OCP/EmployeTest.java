package traore.Exercice_OCP;

import java.util.ArrayList;


import org.junit.Before;
import org.junit.Test;


public class EmployeTest {
	private Employe E1;
	private Employe E2;
	private Vendeur V1;
	private Vendeur V2;
	private Manager M1;
	private Manager M2;
	ArrayList <Employe> listEmploye;
	ArrayList <Vendeur> listVendeur;
	ArrayList <Manager> listManager;
	double salaireTotal;
	
	
	@Before
	  public void setup() {
		E1 = new Employe("Sanou Yann", "02 rue Chatôfort", 5);
		E2 = new Employe("Palme Valerie", "05 rue Vaucresson", 5);
		V1 = new Vendeur("Ky Arnold", "03 rue du pigeon bleu", 2, 100);
		V2 = new Vendeur("Tou Mariam", "07 poulet", 3, 200 );
		 M1 = new Manager("Somé Maël", "08 rue Poissy", 10); 
		M2 = new Manager("Kam Gaël", "01 rue Igny", 5); 
		listEmploye=new ArrayList<Employe>();
		listEmploye.add(E1);
		listEmploye.add(E2);
		listVendeur.add(V1);
		listVendeur.add(V2);
		listManager.add(M1);
		listManager.add(M2);
		salaireTotal=0;
		
		
	}
	
	@Test
	public void SalaireTotalDeTousLesEmployers() {
		
		
		for(int i=0;i < listEmploye.size();i++)
			salaireTotal+=listEmploye.get(i).calculSalaire();
		
		for(int i=0;i < listVendeur.size();i++)
			salaireTotal+=listVendeur.get(i).calculSalaireVendeur();	
		
		for(int i=0;i < listManager.size();i++)
			salaireTotal+=listManager.get(i).calculSalaireManager();	
	
	}
}
