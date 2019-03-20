
public class Plateau {

    int nbPieces;
    int nbPoints;
    Ressource laRessource;

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

        return laRessource;

    }

    public void jouerCarte (Carte carte) {

        this.setNbPoints(nbDePoints+carte.valeur);

    }

    public String toString() {

        System.Out.println('Plateau :'+this+" noombre de points : " + nbDePoints);

    }

 



}