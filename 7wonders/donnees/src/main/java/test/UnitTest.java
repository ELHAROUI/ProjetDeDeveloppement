package test;

import org.junit.Test;


import donnees.*;

import junit.framework.Assert;



public class UnitTest {
	
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testpcs() {
		Piece p = new Piece(5);
	int result=	p.getVal();
	Assert.assertEquals(5, result);
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testMain() {
		Main m = new Main();
		Piece p = new Piece(1);
         m.ajouterPiece(p);
         
         Assert.assertEquals("1", m.getPieces().get(0));
	
	}
	
	

	

}
