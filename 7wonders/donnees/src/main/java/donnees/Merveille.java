package donnees;

/**
 * La classe Merveille
 * @author root
 *
 */
public class Merveille {

	/**
	 * nom de la merveille
	 */
	private String nom ;

	/**
	 * la ressource de la merveille
	 */
	private String ressource;

	/**
	 * Permet de recuperer la ressource de la merveille
	 * @return la ressource
	 */
	public String getRessource() {
		return ressource;
	}

	/**
	 * Permet d'affecter une ressource à la merveille
	 * @param ressource : une chaine de caractere pour la ressource
	 */
	public void setRessource(String ressource) {
		this.ressource = ressource;
	}

	/**
	 * Permet de recuperer le nom de la merveille
	 * @return le nom de la merveillle
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Permet de donner un nom à la merveille
	 * @param nom : nom de la merveille
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Permet de creer une merveille avec une vide ressource
	 */
	public Merveille() { setRessource("-vide-");}

	/**
	 * Permet de créer une ressource avec un nom
	 * @param n : nom de la merveille
	 */
	public Merveille(String n) { this(); setNom(n);}


	/**
	 * Permet d'obtenir des informations sur la merveille
	 */
	public String toString() {
		return "la "+getNom();
	}
}
