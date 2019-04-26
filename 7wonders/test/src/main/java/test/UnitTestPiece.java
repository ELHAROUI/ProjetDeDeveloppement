package test;

import org.junit.Test;
import junit.framework.Assert;
import donnees.Piece;

/**
 * Classe pour test de la classe piece
 * @author root
 *
 */
public class UnitTestPiece {
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testpcs() {
		Piece p = new Piece(5);
	int result=	p.getVal();
	Assert.assertEquals(5, result);
		
	}
	
	
}
