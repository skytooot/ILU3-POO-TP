package cartes;

public interface Cartes {
    // Constantes représentant les cartes de type FEU
    Carte PRIORITAIRE = new Botte(Type.FEU);
    Carte FEU_ROUGE = new Attaque(Type.FEU);
    Carte FEU_VERT = new Parade(Type.FEU);
}
