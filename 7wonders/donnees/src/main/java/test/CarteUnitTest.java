package test;


import static org.junit.Assert.*;
import org.junit.Test;
import donnees.*;

public class CarteUnitTest {

	Carte carte1;
	
	/**
	 * Test des Getters et Setters
	 */
	@Test
	public void testGetSet(){
		carte1 = new Carte();
		carte1.setName("nom1");
		assertEquals("nom1",carte1.getName());
	}
	
	
	
}

