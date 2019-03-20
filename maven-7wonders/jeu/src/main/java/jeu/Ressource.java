
public class Ressource {

    int cout;
    int quantite;
    typeRessource type;

    public Ressource (typeRessource unType , int unCout) {

        this.type=unType;
        this.cout = uncout;
    }

    public Ressource (typeRessource type, int cout , int unequantite) {

        this.cout = uncout;
        this.quantite = unequantite;

    }

    public int getleCout() {

        return uncout;

    }

    public int getlaquantite() {

        return unequantite;
    }

    public typeRessource getType() {

        return type;

    }

}