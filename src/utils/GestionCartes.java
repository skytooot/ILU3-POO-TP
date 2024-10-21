package utils;

import java.util.*;

import cartes.*; 

public class GestionCartes {

	public GestionCartes() {
		// TODO Auto-generated constructor stub
	}
	
	public static Carte extraire(List<Carte> liste) {
		Random random = new Random();
		int indice = random.nextInt(liste.size());
		return liste.remove(indice);
	}
	
	public static List<Carte> melanger(List<Carte> liste){
		List<Carte> listeMelange = new LinkedList<>();
		while(!liste.isEmpty()) {
			listeMelange.add(extraire(liste));
		}
		return listeMelange;
	}
	
	public static boolean verifierMelange(List<Carte> liste1,List<Carte> liste2) {
		for (Iterator<Carte> iterator = liste2.iterator(); iterator.hasNext();) {
			Carte carte = iterator.next();
			if(Collections.frequency(liste2,carte)
					!=Collections.frequency(liste1,carte))return false;
				
		}
		return true;
	}
	
	public static List<Carte> rassembler(List<Carte> liste){
		List<Carte> listeRassemble = new LinkedList<>();
		while(!liste.isEmpty()) {
			Carte carte = liste.remove(0);
			if(listeRassemble.contains(carte))
				listeRassemble.add(listeRassemble.indexOf(carte),carte);
			else
				listeRassemble.add(0,carte);
		}
		return listeRassemble;
	}
	
	/*public static boolean verifierRassemblement(List<Carte> liste) {
		for (Iterator<Carte> iterator1 = liste.iterator(); iterator1.hasNext();) {
			
		}
		return true;
	}*/
	

}
