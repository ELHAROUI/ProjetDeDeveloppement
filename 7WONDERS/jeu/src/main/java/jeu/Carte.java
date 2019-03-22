package jeu;

public class Carte {
	
	int valeur;
	/**
	 * pour la presentation de la valeur de la carte
	 */
	typeCarte type;
	
	
	public Carte(int unCout, typeCarte unType) {
		
		this.cout = unCout;
		this.type=unType;
		
	}
	
	public int getValeur() {
		
		return cout;
		
	}
	
	public typeCarte getType() {
		
		return type;
	}

}