package jeu;

import java.util.LinkedList;
import java.util.List;

import cartes.*;

public class MainJoueur {
	private List<Carte> main= new LinkedList<>();

	public MainJoueur() {
		// TODO Auto-generated constructor stub
	}
	
	public void prendre(Carte carte) {
		main.add(carte);
	}
	
	public void jouer(Carte carte) {
		main.remove(carte);
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		for(int i = 0; i<main.size();i++)chaine.append(main.get(i));
		return chaine.toString();
	}
}