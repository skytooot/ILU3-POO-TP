package jeu;

import cartes.*;

public class Joueur {
	private String nom;
	private ZoneDeJeu zoneDeJeu;
	private MainJoueur main = new MainJoueur();

	public Joueur(String nom,ZoneDeJeu zoneDeJeu) {
		this.nom = nom;
		this.zoneDeJeu = zoneDeJeu;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
	public boolean equals(Object objet) {
		if (objet != null && getClass() == objet.getClass()) {
			Joueur joueurToCompare = (Joueur) objet;
			return nom.equals(joueurToCompare.toString());
		}
		return false;
	}
	
	public void donner(Carte carte) {
		main.prendre(carte);
	}
	
	public Carte prendreCarte(Sabot sabot) {
		if(sabot.estVide())
			return null;
		Carte carte = sabot.piocher();
		donner(carte);
		return carte;
	}
	
	public int donnerKmParcourus() {
		return zoneDeJeu.donnerKmParcourus();
	}
}
