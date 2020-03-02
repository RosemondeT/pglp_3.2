package traore.Exercice_OCP;

import junit.framework.TestCase;
import traore.Exercice_OCP.Before;
import traore.Exercice_OCP.Vendeur;

public class EmployeTest extends TestCase {
	@Before
	  public void setup() {
		Vendeur v1 = new Vendeur("Ky Arnold", "03 rue du pigeon bleu", 2 );
		
	}
}
