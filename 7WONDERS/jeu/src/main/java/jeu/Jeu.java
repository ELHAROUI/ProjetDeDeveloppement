package jeu;


class jeu {

    public static void main (String []args) {


        Ressource res1 = new Ressource(NomRessource.PIERRE,0,1);

        Plateau p1= new Plateau (3,0,res1);
        Carte c = new Carte (0,TypeCarte.batiments_civils);
        p1.jouerCarte(c);

        p1.toString();

        
    }

}