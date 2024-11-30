package jeu;

import cartes.Carte;
import cartes.Limite;

public class Coup {
    private Joueur joueurCourant;
    private Carte carteJouee;
    private Joueur joueurCible; 

    public Coup(Joueur joueurCourant, Carte carteJouee, Joueur joueurCible) {
        this.joueurCourant = joueurCourant;
        this.carteJouee = carteJouee;
        this.joueurCible = joueurCible;
    }

    public Joueur getJoueurCourant() {
        return joueurCourant;
    }

    public Carte getCarteJouee() {
        return carteJouee;
    }

    public Joueur getJoueurCible() {
        return joueurCible;
    }

    public boolean estValide() {
        if (carteJouee instanceof Limite || carteJouee instanceof Limite) {
            return joueurCible != null && joueurCible != joueurCourant;
        }
        return joueurCible == null;
    }

    @Override
    public String toString() {
        if (joueurCible == null) {
            return joueurCourant.toString() + " remet la carte " + carteJouee + " dans le sabot.";
        }
        return joueurCourant.toString() + " joue la carte " + carteJouee + " sur " + joueurCible.toString() + ".";
    }
}
