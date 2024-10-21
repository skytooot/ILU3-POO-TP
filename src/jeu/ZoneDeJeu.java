package jeu;

import java.util.LinkedList;
import java.util.List;

import cartes.*;

public class ZoneDeJeu {
	private List<Limite> pileDeLimites= new LinkedList<>();
	private List<Bataille> pileBataille= new LinkedList<>();
	private List<Borne> pileDeBornes= new LinkedList<>();
	
	public ZoneDeJeu() {
		// TODO Auto-generated constructor stub
	}

	public int donnerLimitationVitesse() {
		if(pileDeLimites.isEmpty() || 
				pileDeLimites.get(pileDeLimites.size()).toString() == "Fin Limite") {
			return 200;
		}
		else {
			return 50;
		}
	}
	
	public int donnerKmParcourus() {
		int km = 0;
		for(int i =0; i<pileDeBornes.size();i++)km+=pileDeBornes.get(i).getKm();
		return km;
	}
	
	public void deposer(Carte carte) {
		
	}
}
