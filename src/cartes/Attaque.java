package cartes;

import cartes.Carte.Bataille;

public class Attaque extends Bataille {

	public Attaque(Type type) {
		super(type);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.type.getAttaque();
	}
}
