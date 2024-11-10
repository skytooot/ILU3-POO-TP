package jeu;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import cartes.*;

public class ZoneDeJeu {
	private List<Limite> pileDeLimites= new LinkedList<>();
	private List<Bataille> pileBataille= new LinkedList<>();
	private List<Borne> pileDeBornes= new LinkedList<>();
	private HashSet<Botte> bottes = new HashSet<>();
	 
	public ZoneDeJeu() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean estPrioritaire() {
		if(bottes.contains(Botte.VEHICULE_PRIORITAIRE))return true;
		
		return false;
	}

	public int donnerLimitationVitesse() {
		if(estPrioritaire() ||pileDeLimites.isEmpty() || 
				pileDeLimites.get(pileDeLimites.size()-1).toString() == "Fin Limite") {
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
		if(carte instanceof Borne  ) {
			pileDeBornes.add((Borne) carte);
		}
		if(carte instanceof Limite  ) {
			pileDeLimites.add((Limite) carte);
		}
		if(carte instanceof Bataille  ) {
			pileBataille.add((Bataille) carte);
		}
		if(carte instanceof Botte) {
			bottes.add((Botte) carte);
		}
	}
	
	
	
	public boolean peutAvancer() {
		return ((!pileBataille.isEmpty())&&(pileBataille.get(pileBataille.size()-1).toString()=="FeuVert"))
				||(pileBataille.isEmpty()&&estPrioritaire())
				||((!pileBataille.isEmpty())&&(pileBataille.get(pileBataille.size()-1) instanceof Parade)&&estPrioritaire())
				||((!pileBataille.isEmpty())&&(pileBataille.get(pileBataille.size()-1) instanceof Attaque)
						&&(pileBataille.get(pileBataille.size()-1).getType() == Type.FEU) &&estPrioritaire())
				;
	}
	
	private boolean estDepotFeuVertAutorise() {
		return (pileBataille.isEmpty())
				|| pileBataille.get(pileBataille.size()-1).toString()=="FeuRouge"
				|| pileBataille.get(pileBataille.size()-1).toString()!="FeuVert" ;
	}
	
	private boolean estDepotBorneAutorise(Borne borne) {
		boolean depotOk = true;
		if(peutAvancer()) {
			if(!pileDeLimites.isEmpty() && 
				pileDeLimites.get(pileDeLimites.size()-1).toString() == "Limite 50"
				&& borne.getKm() > 50)
				return false;
		}
		if(donnerKmParcourus() > 1000)
			depotOk = false;
		return depotOk;
	}
	
	private boolean estDepotLimiteAutorise(Limite limite) {
		if(estPrioritaire()) return false;
		if(limite.toString() != "Fin Limite" &&(pileDeLimites.isEmpty() || 
				pileDeLimites.get(pileDeLimites.size()-1).toString() == "Fin Limite"))
			return true;
		if(limite.toString() == "Fin Limite" &&(!pileDeLimites.isEmpty() && 
				pileDeLimites.get(pileDeLimites.size()-1).toString() != "Fin Limite"))
			return true;
		return false;
	}
	
	private boolean estDepotBatailleAutorise(Bataille bataille) {
		if(bataille instanceof Parade) {
			if(bataille.toString() == "FeuVert")
				return estDepotFeuVertAutorise();
			return (!pileBataille.isEmpty())&&pileBataille.get(pileBataille.size()-1).getType()==bataille.getType();
		}
		if(bataille instanceof Attaque)return peutAvancer();
		return true;
		
	}
	
	public boolean estDepotAutorise(Carte carte) {
		if(carte instanceof Borne  ) {
			return estDepotBorneAutorise((Borne) carte);
		}
		if(carte instanceof Limite  ) {
			return estDepotLimiteAutorise((Limite) carte);
		}
		if(carte instanceof Bataille  ) {
			return  estDepotBatailleAutorise( (Bataille) carte);
		}
		if(carte instanceof Botte  ) {
			return  true;
		}
		return false;
	}
	
	
	
	
}
