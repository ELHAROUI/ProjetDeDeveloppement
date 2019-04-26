package test;

import org.junit.Test;


import donnees.*;

import junit.framework.Assert;



@SuppressWarnings("deprecation")
public class UnitTest {
	
	// Ceci est un test de la classe piéce pour voir si l'element retourne la vraie valeur
	@Test 
	public void testpcs() {
		
		Piece p = new Piece(5);
	int result=	p.getVal();
	Assert.assertEquals(5, result);
		
	}
	
	// Ceci est   un test de la classe Main pour voir si l'element retourne la vraie valeur des piéces dans une main 
	
	
	@Test
	public void testMain() {
		Main m = new Main();
		Piece p = new Piece(1);
         m.ajouterPiece(p);
         
         Assert.assertEquals("1", m.getPieces().get(0));
	
	}
	
	
	
	

	

}
