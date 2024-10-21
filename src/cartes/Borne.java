package cartes;

public class Borne extends Carte {
	private int km;
	public Borne(int km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return km+"KM";
	}
	
	public int getKm() {
		return km;
	}
	
	public boolean equals(Object objet) {
		if (objet != null && getClass() == objet.getClass()) {
			Borne carteToCompare = (Borne) objet;
			String nom = toString();
			return nom.equals(carteToCompare.toString());
		}
		return false;
	}

}
