package jeu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cartes.Carte;
import utils.GestionCartes;

public class Jeu {
	private Sabot sabot;

	public Jeu(Carte[] JeuDeCartes) {
		List<Carte> listeCartes = new ArrayList<>();
		Collections.addAll(listeCartes,JeuDeCartes);
		listeCartes = GestionCartes.melanger(listeCartes);
		Carte[] cartes =listeCartes.toArray(new Carte[0]);
		this.sabot = new Sabot(cartes);
	}
	
	public Sabot getSabot() {
		return sabot;
	}

}
