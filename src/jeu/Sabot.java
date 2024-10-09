package jeu;

import java.util.Iterator;

import cartes.*; 

public class Sabot implements Iterable<Carte>{
	private Carte[] cartes;
	private int nbCartes;
	

	public Sabot(Carte[] cartes) {
		this.cartes = cartes;
		this.nbCartes = cartes.length;
	}
	
	public boolean estVide() {
		return nbCartes == 0;
	}
	
	public void ajouterCarte(Carte carte) {
		cartes[nbCartes] = carte;
		nbCartes++;
	}
	

	@Override
	public Iterateur iterator() {
		// TODO Auto-generated method stub
		return new Iterateur();
	}
	
	public Carte piocher() {
		Iterateur it = (Iterateur) iterator();
		Carte p = it.next();
		it.remove();
		return p;
	}
	
	private class Iterateur implements Iterator<Carte>{
		private int indice = 0;
		

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return indice < nbCartes;
		}

		@Override
		public Carte next() {
			// TODO Auto-generated method stub
			return cartes[indice++];
		}
		
		public void remove() {
			for(int i = indice;i<nbCartes;i++) {
				cartes[i-1] = cartes[i];
			}
			nbCartes--;
			indice--;
		}
		
	}
	
}
