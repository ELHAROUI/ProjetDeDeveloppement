package jeu;

import jeu.NomRessource;

public class Ressource {
	
	NomRessource nom;
	int cout;
	int quantite;
	
	public Ressource  (NomRessource unNom, int unCout) {
		
		this.nom=unNom;
		this.cout=unCout;
		
	}
	
	public Ressource (NomRessource unNom, int unCout, int uneQuantite) {
		
		
		this.nom=unNom;
		this.cout=unCout;
		this.quantite=uneQuantite;
		
		
	}
	
	  public int getCout() {

	        return cout;

	    }

	    public int getQuantite() {

	        return quantite;
	    }

	    public NomRessource getNom() {

	        return nom;

	    }
	
	    
}