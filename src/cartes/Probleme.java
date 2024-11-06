package cartes;

public abstract class Probleme extends Carte {
	protected Type type;
	
	public Probleme(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
	public String toString() {
		return type.getAttaque();
	}
}
