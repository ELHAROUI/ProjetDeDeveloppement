package test;

import static org.junit.Assert.*;

import org.junit.Test;
import donnees.*;
import junit.framework.Assert;

public class MerveilleUnitTest {
	
    Merveille merveilleTest1;
    Merveille merveilleTest2;

    /**
     * Test des Getters et Setters des noms
     */
    @Test
    public void testSetGetNom(){
    	merveilleTest1 = new Merveille();
    	
    	merveilleTest1.setNom("merveille1");
        assertEquals("merveille1",merveilleTest1.getNom());

    }

    /**
     * Test des Getters et Setters des ressources
     */
    @Test
    public void testSetGetRessource(){

    	merveilleTest2 = new Merveille();
    	merveilleTest2.setRessource("ressource2");
        assertEquals("ressource2",merveilleTest2.getRessource());

    }

    /**
     * Ceci est un test de la classe Merveille pour voir si l'element retourne la vraie valeur de la merveille réelle
     */
	@Test
	public void testMerveille () {
		
	 Merveille mer = new Merveille("Batiment");
	 
	 String res1= mer.getNom();
	 
	 Assert.assertSame("Batiment", res1);
	 
		
	}

}
