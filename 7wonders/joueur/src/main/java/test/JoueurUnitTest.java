package test;

import static org.junit.Assert.*;

import org.junit.Test;

import config.CONFIG;
import donnees.Merveille;
import joueur.Joueur;

public class JoueurUnitTest {

	Joueur [] joueurs = new Joueur[CONFIG.NB_JOUEURS];
	private Merveille merveille;


	/**
	 * test d'attribution d'une merveille
	 */
	@Test
	public void attribuerMerveille() {

		for(int i = 0 ; i < CONFIG.NB_JOUEURS; i++) {
			joueurs[i] = new Joueur("Joueur"+(i+1));
			joueurs[i].démarrer();
		}

		merveille = new Merveille("merveille1");

		for(int i = 0 ; i < CONFIG.NB_JOUEURS; i++) {
			joueurs[i].setMerveille(merveille);
			assertEquals("merveille1",joueurs[i].getMerveille().getNom());
		}
	}

}
