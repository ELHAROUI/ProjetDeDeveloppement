package jeu;



public class Plateau {

    int nbPieces;
    int nbPoints;
    Ressource laRessourcePrincipale;
   

    public Plateau (int nbDePieces , int nbDePoints, Ressource uneRessource) {

        this.nbPieces = nbDePieces;
        this.nbPoints = nbDePoints;
        this.laRessource = uneRessource;
   
    }

    public int getNbPieces() {

        return nbDePieces;
    }

    public int getNbPoints() {

        return nbDePoints;
    }

    public void setNbPoints (int nb) {

        this.nbDePoints = nb;
    }

    public Ressource getLaRessource() {

        return laRessourcePrincipale;

    }

    public void jouerCarte (Carte carte) {

        if (carte.getType() == typeCarte.batiments_civils) {
        	if (carte.getValeur() == 1) 
        		this.nbPoints +=1;
        	if (carte.getValeur() == 3)
        		this.nbPoints +=3;
        	if (carte.getValeur() == 5)
        		this.nbPoints +=5;
        }
    }

    public String toString() {

        System.Out.println('Plateau :'+this+" nombre de points : " + nbDePoints);

    }

}