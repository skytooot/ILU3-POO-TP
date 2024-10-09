package cartes;

import cartes.Carte.Bataille;

public class Parade extends Bataille {

	public Parade(Type type) {
		super(type);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.type.getParade();
	}
}
