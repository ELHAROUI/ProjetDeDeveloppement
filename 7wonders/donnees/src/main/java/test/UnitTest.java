package test;

import org.junit.Test;

import donnees.Piece;
import donnees.*;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class UnitTest {
	
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testpcs() {
		Piece p = new Piece(5);
	int result=	p.getVal();
	Assert.assertEquals(5, result);
		
	}
	
	
	

	

}
