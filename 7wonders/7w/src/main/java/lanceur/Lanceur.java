package lanceur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import config.CONFIG;
import joueur.Joueur;
import moteur.Partie;

public class Lanceur {


	public static final void main(String  [] args) throws IOException {
		Partie p = new Partie();
		Joueur [] joueurs = new Joueur[CONFIG.NB_JOUEURS];
		
		System.out.println("\t\t\t=================================================================");
		System.out.println("\t\t\t!!!~~~~~~~~!!! Bienvenue dans le Jeu de 7wonders !!!~~~~~~~~!!!");
		System.out.println("\t\t\t=================================================================");
		System.out.println();
		
		// Création des 3 joueurs
		BufferedReader brNom = new BufferedReader(new InputStreamReader(System.in));
		for (int i=0; i<CONFIG.NB_JOUEURS ; ++i)
		{
			System.out.print("Saisissez le nom de Joueur n°"+(i+1)+" : ");
			//System.out.println(bf.readLine());
			joueurs[i] = new Joueur(brNom.readLine());
		}

		// démarrage du jeu
		p.démarrer();
		for(int i = 0 ; i < CONFIG.NB_JOUEURS; i++) {
			joueurs[i].démarrer();
		}
	}
}