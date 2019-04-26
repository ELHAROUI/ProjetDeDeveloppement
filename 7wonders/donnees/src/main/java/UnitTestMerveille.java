import org.junit.Test;

import donnees.Merveille;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class UnitTestMerveille {

	
	// Ceci est un test de la classe Merveille pour voir si l'element retourne la vraie valeur de la merveille réelle

		@Test
		public void testMerv () {
			
		 Merveille mer = new Merveille("Batiment");
		 
		 String res1= mer.getNom();
		 
		 Assert.assertSame("Batiment", res1);
		 
			
		}
}
