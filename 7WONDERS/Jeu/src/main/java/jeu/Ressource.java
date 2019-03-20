package jeu;


public class Ressource {
	
	int id;
	nomRessource nom;
	int cout;
	int quantite;
	
	public Ressource (int unId, nomRessource unNom, int unCout) {
		
		this.id=unId;
		this.nom=unNom;
		this.cout=unCout;
		
	}
	
	public Ressource (int unId, nomRessource unNom, int unCout, int uneQuantite) {
		
		
		this.id=unId;
		this.nom=unNom;
		this.cout=unCout;
		this.quantite=uneQuantite;
		
		
	}
	
	  public int getleCout() {

	        return cout;

	    }

	    public int getlaquantite() {

	        return quantite;
	    }

	    public nomRessource getType() {

	        return nom;

	    }
	
	    
}