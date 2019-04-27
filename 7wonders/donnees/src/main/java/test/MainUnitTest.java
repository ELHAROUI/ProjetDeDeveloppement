package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import donnees.*;


public class MainUnitTest {

	Main main;
	private ArrayList<Carte> cartes ;
	Carte carte1, carte2, carte3;
	private ArrayList<Piece> pieces ;
	Piece piece1, piece2, piece3;
	
    @Test
    public void testAjoutCartePiece() {
    	
		this.main = new Main();

		this.cartes = new ArrayList<Carte>();

		this.main.setCartes(cartes);
		
		this.pieces = new ArrayList<Piece>();
		
		this.main.setPieces(pieces);
		
        this.main.ajouterCarte(carte1);
        this.main.ajouterCarte(carte2);
        this.main.ajouterCarte(carte3);
        
        this.main.ajouterPiece(piece1);
        this.main.ajouterPiece(piece2);
        this.main.ajouterPiece(piece3);

        /**
         * test de la taille des cartes dans la main
         */
        assertEquals(3, this.main.getCartes().size());

        
        /**
         * test de la taille du main de pieces
         */
        assertEquals(3, this.main.getPieces().size());


    }



}
