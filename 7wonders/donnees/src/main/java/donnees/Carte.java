package donnees;

/**
 * la classe Carte
 * @author root
 *
 */
public class Carte {

	/**
	 * nom de la carte
	 */
	private String name;

	/**
	 * type de la carte
	 */
	private TypeCarte type;


	/**
	 * Permet de recuperer le nom de la carte
	 * @return le nom de la carte
	 */
	public String getName() {
		return name;
	}

	/**
	 * Permet de donner un nom à la carte
	 * @param name nom de la carte
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Permet de recuperer le type de la carte
	 * @return le type de la carte
	 */
	public TypeCarte getType() {
		return type;
	}

	/**
	 * Permet de creer une carte
	 * @param name nom de la carte
	 */
	public Carte(String name) {
		this.name = name;
	}

	/**
	 * Permet d'avoir des informations sur la carte
	 * @return un string contient les nformations de la carte
	 */
	public String toString() {
		return "[carte - "+getName()+" -]";
	}

	/**
	 * Permet de comparer deux cartes
	 * @param o l'objet à comparer avec l'objet actuel
	 * @return true si les objets sont identiques, sinon false
	 */
	public boolean equals(Object o) {
		if ((o != null) && (o instanceof Carte)) {
			return getName().equals(((Carte) o).getName());
		}
		else return false;
	}
}
