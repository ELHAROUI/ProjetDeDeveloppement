package donnees;

import java.util.ArrayList;

public class Main {

    private ArrayList<Carte> cartes ;
    private ArrayList<Piece> pieces ;

    public ArrayList<Carte> getCartes() {
        return cartes;
    }

    
    public ArrayList<Piece> getPieces() {
        return pieces;
    }
    
    
    public void setCartes(ArrayList<Carte> cartes) {
        this.cartes = cartes;
    }

    
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
    
    
    public Main() {
    	cartes = new ArrayList<>();
    	pieces = new ArrayList<>();
    
    }
    
    
    /*public Main(ArrayList<Carte> cartes) {
        this.cartes = cartes;
    }


    public Main(ArrayList<Piece> pieces ) {
   
   this.pieces=pieces;
}
*/
    

    public void ajouterCarte(Carte c) {
        getCartes().add(c);
    }
    
    public void ajouterPiece(Piece p) {
        getPieces().add(p);
    }


    public String toString()  {
        String texte = "[";

        for(Carte c : cartes) texte += c +" ; ";

        if (texte.length() > 4) texte = texte.substring(0, texte.length()-3);

        texte += "]";
        for (Piece p : pieces) texte += " /// "+ p +" /// ";
        
        
        return texte;
    }


}
