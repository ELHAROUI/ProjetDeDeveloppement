class jeu {

    public static void main (String []args) {


        typeRessource [] allTypes = typeRessource.values();
        typeRessource randomType = randomElement(allTypes);

        Ressource res1 = new Ressource(0,0,randomType);

        Plateau p1= new Plateau (3,0,res1);
        
        p1.jouerCarte();

        p1.toString();





    }

}