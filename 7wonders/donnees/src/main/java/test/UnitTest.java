package test;

import org.junit.Test;

import donnees.Piece;
import junit.framework.Assert;


public class UnitTest {
	
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testpcs() {
		Piece p = new Piece(5);
	int result=	p.getVal();
	Assert.assertEquals(5, result);
		
	}

}
