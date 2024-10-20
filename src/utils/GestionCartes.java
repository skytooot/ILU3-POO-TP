package utils;

import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		List<Carte> listeMelanger = new LinkedList<>();
		while(!liste.isEmpty()) {
			listeMelanger.add(extraire(liste));
		}
		return listeMelanger;
	}
	

}
