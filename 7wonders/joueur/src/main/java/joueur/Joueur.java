package joueur;

import config.CONFIG;
import config.MESSAGES;
import donnees.Carte;
import donnees.Main;
import donnees.Merveille;
import donnees.Piece;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;

public class Joueur {


	private String nom;
	Socket connexion ;
	private Merveille merveille;
	//private Piece piece;


	public Joueur(String un_joueur) {
		setNom(un_joueur);

		System.out.println(nom +" > creation");
		try {
			// préparation de la connexion
			connexion = IO.socket("http://" + CONFIG.IP + ":" + CONFIG.PORT);

			// abonnement à la connexion
			connexion.on("connect", new Emitter.Listener() {
				@Override
				public void call(Object... objects) {
					System.out.println(getNom() + " > connecte");
					System.out.println(getNom()+" > envoi de mon nom");
					connexion.emit(MESSAGES.MON_NOM, getNom());
				}
			});


			// réception de la merveille
			connexion.on(MESSAGES.ENVOI_DE_MERVEILLE, new Emitter.Listener() {
				@Override
				public void call(Object... objects) {
					// réception du JSON
					JSONObject merveilleJSON = (JSONObject)objects[0];
					try {
						// conversion du JSON en Merveille
						String n = merveilleJSON.getString("nom");
						// les merveilles ont toutes une ressource vide, pour illustrer avec un objet avec plus qu'une seule propriété
						String ressource = merveilleJSON.getString("ressource");
						Merveille m = new Merveille(n);
						m.setRessource(ressource);

						// mémorisation de la merveille					
						System.out.println("");
						System.out.println("-------------------"+ nom +" reçoit sa merveille-------------------");
						System.out.println(nom+" > j'ai recu "+m);
						System.out.println("");
						setMerveille(m);
					} catch (JSONException e) {
						e.printStackTrace();
					}
				}
			});





			// réception de la main et des piéces 
			connexion.on(MESSAGES.ENVOI_DE_MAIN, new Emitter.Listener() {
				@Override
				public void call(Object... objects) {
					// réception de l'objet JSON : une main
					JSONObject mainJSON = (JSONObject)objects[0];
					try {
						Main m = new Main();
						// la main ne contient qu'une liste de carte, c'est un JSONArray
						JSONArray cartesJSON = mainJSON.getJSONArray("cartes");
						// on recrée chaque carte
						for(int j = 0 ; j < cartesJSON.length(); j++) {
							JSONObject carteJSON = (JSONObject) cartesJSON.get(j);
							Carte c = new Carte(carteJSON.getString("name"));
							m.ajouterCarte(c);
						}
						// on creer et distribue les cartes
						//on utilise une boucle pour creer 3 piéces et les donner aux joueurs

						for(int j = 0 ; j < 3; j++) {

							Piece p = new Piece(1);

							m.ajouterPiece(p);
						}

						System.out.println("");
						System.out.println("-------------------"+ nom +" reçoit ses cartes et pieces -------------------");
						System.out.println(nom+" > j'ai recu "+m);
						System.out.println("");

						// le joueur a reçu, il joue
						jouer(m);

					} catch (JSONException e) {
						e.printStackTrace();
					}
				}
			});





		}


		catch (
				URISyntaxException e) {
			e.printStackTrace();
		}
	}


	private void jouer(Main m) {
		// ne fonctionne pas dans Android
		JSONObject pieceJointe = new JSONObject(m.getCartes().get(0)) ;

		

		System.out.println("");
		System.out.println("-------------------"+ nom +" joue une carte -------------------");
		System.out.println(nom + " > je joue "+m.getCartes().get(0));
		System.out.println("");
		connexion.emit(MESSAGES.JE_JOUE, pieceJointe);
	}

	public void démarrer() {
		// connexion effective
		if (connexion != null) connexion.connect();
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}


	public static final void main(String  [] args) {
		Joueur j = new Joueur("toto");
		j.démarrer();
	}

	public void setMerveille(Merveille merveille) {
		this.merveille = merveille;
	}



	public Merveille getMerveille() {
		return merveille;
	}
}
