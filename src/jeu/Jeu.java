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
		Carte[] tab = (Carte[]) listeCartes.toArray();
		this.sabot = new Sabot(tab);
	}

}
