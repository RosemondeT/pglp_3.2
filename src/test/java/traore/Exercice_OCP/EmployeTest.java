package traore.Exercice_OCP;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;


import org.junit.Before;
import org.junit.Test;

/**
 * Classe EmployeTest qui test les différentes méthodes de notre classe Employe ainsi que ces classes filles
 */
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
		V1 = new Vendeur("Ky Arnold", "03 rue du pigeon bleu", 2, 100);
		 M1 = new Manager("Somé Maël", "08 rue Poissy", 10); 
		
		E2 = new Employe("Palme Valerie", "05 rue Vaucresson", 5);
		
		V2 = new Vendeur("Tou Mariam", "07 poulet", 3, 200 );
	
		M2 = new Manager("Kam Gaël", "01 rue Igny", 5); 
		listEmploye=new ArrayList<Employe>();
		listVendeur=new ArrayList<Vendeur>();
		listManager=new ArrayList<Manager>();
		listEmploye.add(E1);
		listEmploye.add(E2);
		listVendeur.add(V1);
		listVendeur.add(V2);
		listManager.add(M1);
		listManager.add(M2);
		//salaireTotal=0;
		
	
	}
	
	/**
     * Méthode CalculSalaireDansEmployer() qui test la méthode CalculSalaire()
     */
	
	@Test
	public void CalculSalaireDansEmployer() {
		 double sal1= 1500+20*5;
		 
		 assertTrue(E1.calculSalaire() == sal1);
	
	}
	
	/**
     * Méthode CalculSalaireVendeur() qui test la méthode CalculSalaireVendeur()
     */
	
	@Test
	public void CalculSalaireVendeur() {
		 double sal2= 1500+20*2+100;
		 assertTrue(V1.calculSalaireVendeur() == sal2);
	}
	
	/**
     * Méthode CalculSalaireManager() qui test la méthode CalculSalaireManager()
     */
	@Test
	public void CalculSalaireManager() {
		 double sal3= 1500+20*10+100;
		 assertTrue(M1.calculSalaireManager() == sal3);
	}
	
	/**
     * MéthodeCalculSalaireTotalDeTousLesEmployers() qui test la méthode sommeTotal()
     */
	@Test
	public void CalculSalaireTotalDeTousLesEmployers() {
		double total = 10100;
		double salaireTotalTousEmploye  = 0;
		
		
		for(int i=0;i < listEmploye.size();i++)
			salaireTotalTousEmploye+=listEmploye.get(i).calculSalaire();
		
		for(int i=0;i < listVendeur.size();i++)
			salaireTotalTousEmploye+=listVendeur.get(i).calculSalaireVendeur();	
		
		for(int i=0;i < listManager.size();i++)
			salaireTotalTousEmploye+=listManager.get(i).calculSalaireManager();
		
		assertTrue( salaireTotalTousEmploye == total);	
		}
		
		
	
}
