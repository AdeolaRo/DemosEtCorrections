package org.example.joueur;

public class Joueur {

    private String nom = "roro";
    private int niveau = 0;
    private int pointExperience = 0;
    private int quete = 0;

    public Joueur(String nom, int niveau, int pointExperience, int quete) {
        this.nom = nom;
        this.niveau = niveau;
        this.pointExperience = pointExperience;
        this.quete = quete;
    }

    public Joueur(){};

            public void effectuerUneQuete () {
            pointExperience += 10;
            quete++;
            if (pointExperience > 100){
                niveau++;
                pointExperience = 0;
                }
        }

            public String getNom () {
                return nom;
            }
            public void setNom (String nom){
                this.nom = nom;
            }

            public int getNiveau () {
                return niveau;
            }
            public void setNiveau ( int niveau){
                this.niveau = niveau;
            }

            public int getPointExperience () {
                return pointExperience;
            }
            public void setPointExperience ( int pointExperience){
                this.pointExperience = pointExperience;
            }

    @Override
    public String toString() {
        return " Le Joueur " + nom + " effectue la quête n° " + quete;
    }
}



