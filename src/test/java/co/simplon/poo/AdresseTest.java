package co.simplon.poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdresseTest {

	@Test
	public void adresses_identiques_en_memoire_sont_equals() {
		Adresse adresse1 = new Adresse(1, "rue des Lilas",92100, "Courbevois");
		Adresse adresse2 = adresse1;
		
		boolean comparaison1 = adresse1.equals(adresse2);
		boolean comparaison2 = adresse1.equals(adresse2);
		
		assertTrue(adresse1 == adresse2);
		assertTrue(comparaison1);
		assertTrue(comparaison2);
	}
	
	@Test
	public void si_adresse_distinctes_en_memoire_mais_identique_alors_equals_true() {
		Adresse adresse1 = new Adresse(1, "rue des Lilas",92100, "Courbevois");
		Adresse adresse2 = new Adresse(1, "rue des Lilas",92100, "Courbevois");
		
		boolean comparaison = adresse1.equals(adresse2);
		
		assertTrue(comparaison);
	}
	
	@Test
	public void si_adresses_differentes_alors_equals_false() {
		Adresse adresse1 = new Adresse(12, "avenue de la Liberté", 75000, "Paris");
		Adresse adresse2 = new Adresse(1, "rue des Lilas",92100, "Courbevois");
		
		boolean comparaison = adresse1.equals(adresse2);
		
		assertFalse(comparaison);
		
		Adresse adresse3 = new Adresse(1, "rue des Lilas",92100, "Courbevois");
		Adresse adresse4 = new Adresse(1, "Rue des Lilas",92100, "Courbevois");
		
		boolean comparaison1 = adresse3.equals(adresse4);
		
		assertFalse(comparaison1);
	}
	
	@Test
	public void comparaison_adresse_non_null_avec_null_equals_false() {
		Adresse adresse1 = new Adresse(12, "avenue de la Liberté", 75000, "Paris");
		Adresse adresse2 = null;
		
		boolean comparaison = adresse1.equals(adresse2);
		boolean comparaison1 = adresse1.equals(null);
		
		assertFalse(comparaison);
		assertFalse(comparaison1);
	}
	
	@Test
	public void adresses_distinctes_en_memoire_hashcode_identique() {
		Adresse adresse1 = new Adresse(1, "rue des Lilas",92100, "Courbevois");
		Adresse adresse2 = new Adresse(1, "rue des Lilas",92200, "Courbevois");
		
		int hashcodeAdresse1 = adresse1.hashCode();
		int hashcodeAdresse2 = adresse2.hashCode();
		
		assertEquals(hashcodeAdresse1, hashcodeAdresse2);
	}

}
