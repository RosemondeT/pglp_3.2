package traore.Exercice_OCP;

import static org.junit.Assert.assertTrue;

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
	private Entreprise E;
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
		E = new Entreprise();
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
	public void CalculSalaireDansEmployer() {
		 double sal1= 1500+2*5;
		 assertTrue(E1.calculSalaire() == sal1);
	
	}
	
	@Test
	public void CalculSalaireVendeur() {
		 double sal2= 1500+2*5+100;
		 assertTrue(V1.calculSalaireVendeur() == sal2);
	}
	
	@Test
	public void CalculSalaireManager() {
		 double sal3= 1500+2*10+100;
		 assertTrue(M1.calculSalaireManager() == sal3);
	}
	
	@Test
	public void CalculSalaireTotalDeTousLesEmployers() {
		double total = 8116;
		 assertTrue(E.sommeTotale() == total);	
		
	}
}
