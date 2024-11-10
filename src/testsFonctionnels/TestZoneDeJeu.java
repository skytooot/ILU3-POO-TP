package testsFonctionnels;

import cartes.Attaque;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.Parade;
import cartes.Type;
import jeu.ZoneDeJeu;

public class TestZoneDeJeu {
	public static void main(String[] args) {
		// TP3 PARTIE 2
//		ZoneDeJeu zoneDeJeu = new ZoneDeJeu();
//		System.out.println("Deposer carte 25 km");
//		zoneDeJeu.deposer(new Borne(25));
//		System.out.println("Deposer carte 50 km");
//		zoneDeJeu.deposer(new Borne(50));
//		System.out.println("Deposer carte 75 km");
//		zoneDeJeu.deposer(new Borne(75));
//		System.out.println("Total des bornes : " + zoneDeJeu.donnerKmParcourus());

//		System.out.println("Limite : " + zoneDeJeu.donnerLimitationVitesse());
//		zoneDeJeu.deposer(new DebutLimite());
//		System.out.println("Limite : " + zoneDeJeu.donnerLimitationVitesse());
//		zoneDeJeu.deposer(new FinLimite());
//		System.out.println("Limite : " + zoneDeJeu.donnerLimitationVitesse());
		
/*
		// TP3 PARTIE 3
		boolean depotOK = false;
		ZoneDeJeu zoneDeJeu = new ZoneDeJeu();
		// Feu rouge
		System.out.println("Deposer carte Feu rouge");
		depotOK = zoneDeJeu.estDepotAutorise(new Attaque(Type.FEU));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Attaque(Type.FEU));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
//		// accident
		System.out.println("Deposer carte attaque - accident");
		depotOK = zoneDeJeu.estDepotAutorise(new Attaque(Type.ACCIDENT));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Attaque(Type.ACCIDENT));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// Feu vert
		System.out.println("Deposer carte Feu vert");
		depotOK = zoneDeJeu.estDepotAutorise(new Parade(Type.FEU));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Parade(Type.FEU));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// panne d'essence
		System.out.println("Deposer carte attaque - essence");
		depotOK = zoneDeJeu.estDepotAutorise(new Attaque(Type.ESSENCE));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Attaque(Type.ESSENCE));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// roue de secours
		System.out.println("Deposer carte parade - roue de secours");
		depotOK = zoneDeJeu.estDepotAutorise(new Parade(Type.CREVAISON));
		if (depotOK) {
			zoneDeJeu.deposer(new Parade(Type.CREVAISON));
		}
		System.out.println("dépot ok ? " + depotOK);
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// bidon d'essence
		System.out.println("Deposer carte parade - essence");
		depotOK = zoneDeJeu.estDepotAutorise(new Parade(Type.ESSENCE));
		if (depotOK) {
			zoneDeJeu.deposer(new Parade(Type.ESSENCE));
		}
		System.out.println("dépot ok ? " + depotOK);
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// Feu vert
		System.out.println("Deposer carte Feu vert");
		depotOK = zoneDeJeu.estDepotAutorise(new Parade(Type.FEU));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Parade(Type.FEU));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// dépot 100 bornes
		System.out.println("Deposer carte borne - 100");
		depotOK = zoneDeJeu.estDepotAutorise(new Borne(100));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Borne(100));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// dépot limitation de vitesse 50 bornes
		System.out.println("Deposer carte limite - 50");
		depotOK = zoneDeJeu.estDepotAutorise(new DebutLimite());
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new DebutLimite());
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// dépot 100 bornes
		System.out.println("Deposer carte borne - 100");
		depotOK = zoneDeJeu.estDepotAutorise(new Borne(100));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Borne(100));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// Depot 25 bornes
		System.out.println("Deposer carte borne - 25");
		depotOK = zoneDeJeu.estDepotAutorise(new Borne(25));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Borne(25));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// dépot fin limitation
		System.out.println("Deposer carte fin limite - 50");
		depotOK = zoneDeJeu.estDepotAutorise(new FinLimite());
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new FinLimite());
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// dépot 100 bornes
		System.out.println("Deposer carte borne - 100");
		depotOK = zoneDeJeu.estDepotAutorise(new Borne(100));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Borne(100));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());*/

// RESULTAT ATTENDU POUR LA PARTIE 3 (ne pas d�commenter)
// 			Deposer carte Feu rouge
//			dépot ok ? false
//			peut avancer ? false
//			Deposer carte attaque - accident
//			dépot ok ? false
//			peut avancer ? false
//			Deposer carte Feu vert
//			dépot ok ? true
//			peut avancer ? true
//			Deposer carte attaque - essence
//			dépot ok ? true
//			peut avancer ? false
//			Deposer carte parade - roue de secours
//			dépot ok ? false
//			peut avancer ? false
//			Deposer carte parade - essence
//			dépot ok ? true
//			peut avancer ? false
//			Deposer carte Feu vert
//			dépot ok ? true
//			peut avancer ? true
//			Deposer carte borne - 100
//			dépot ok ? true
//			peut avancer ? true
//			Deposer carte limite - 50
//			dépot ok ? true
//			peut avancer ? true
//			Deposer carte borne - 100
//			dépot ok ? false
//			peut avancer ? true
//			Deposer carte borne - 25
//			dépot ok ? true
//			peut avancer ? true
//			Deposer carte fin limite - 50
//			dépot ok ? true
//			peut avancer ? true
//			Deposer carte borne - 100
//			dépot ok ? true
//			peut avancer ? true

		// TP4 Partie 1
		boolean depotOK = false;
		// Feu rouge
		ZoneDeJeu zoneDeJeu = new ZoneDeJeu();

		System.out.println("Deposer carte Feu rouge");
		depotOK = zoneDeJeu.estDepotAutorise(new Attaque(Type.FEU));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Attaque(Type.FEU));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// Botte Vehicule prioritaire
		System.out.println("Deposer carte Vehicule prioritaire");
		depotOK = zoneDeJeu.estDepotAutorise(new Botte(Type.FEU));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Botte(Type.FEU));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// accident
		System.out.println("Deposer carte attaque - accident");
		depotOK = zoneDeJeu.estDepotAutorise(new Attaque(Type.ACCIDENT));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Attaque(Type.ACCIDENT));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
	
		// botte roue de secours
		System.out.println("Deposer botte - roue de secours");
		depotOK = zoneDeJeu.estDepotAutorise(new Botte(Type.CREVAISON));
		if (depotOK) {
			zoneDeJeu.deposer(new Botte(Type.CREVAISON));
		}
		System.out.println("dépot ok ? " + depotOK);
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// botte as du volant
		System.out.println("Deposer carte as du volant");
		depotOK = zoneDeJeu.estDepotAutorise(new Botte(Type.ACCIDENT));
		if (depotOK) {
			zoneDeJeu.deposer(new Botte(Type.ACCIDENT));
		}
		System.out.println("dépot ok ? " + depotOK);
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// Feu vert
		System.out.println("Deposer carte Feu vert");
		depotOK = zoneDeJeu.estDepotAutorise(new Parade(Type.FEU));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Parade(Type.FEU));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// dépot attaque accident
		System.out.println("Deposer carte accident");
		depotOK = zoneDeJeu.estDepotAutorise(new Attaque(Type.ACCIDENT));
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Attaque(Type.ACCIDENT));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// dépot limitation de vitesse 50 bornes
		System.out.println("Deposer carte limite - 50");
		depotOK = zoneDeJeu.estDepotAutorise(new DebutLimite());
		System.out.println("dépot ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new DebutLimite());
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		
		//RESULTAT ATTENDU POUR LE TP4 Partie 1
//		Deposer carte Feu rouge
//		dépot ok ? false
//		peut avancer ? false
//		Deposer carte Vehicule prioritaire
//		dépot ok ? true
//		peut avancer ? true
//		Deposer carte attaque - accident
//		dépot ok ? true
//		peut avancer ? false
//		Deposer botte - roue de secours
//		dépot ok ? true
//		peut avancer ? false
//		Deposer carte as du volant
//		dépot ok ? true
//		peut avancer ? true
//		Deposer carte Feu vert
//		dépot ok ? false
//		peut avancer ? true
//		Deposer carte accident
//		dépot ok ? false
//		peut avancer ? true
//		Deposer carte limite - 50
//		dépot ok ? false
//		peut avancer ? true
	}
}
