package test;

import static org.junit.Assert.*;

import org.junit.Test;
import donnees.*;

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

}
