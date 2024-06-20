package org.example.chaise;

public class Chaise {

    private int nbreDePieds = 2;
    private String materiaux = "Zinc";
    private String couleur = "rouge";
    private double prix = 100;


    public Chaise(int nbreDePieds, String materiaux, String couleur, double prix) {
        this.nbreDePieds = nbreDePieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;
    }
    public Chaise() {
     }


    public int getNbreDePieds() {
        return nbreDePieds;
    }

    public void setNbreDePieds(int nbreDePieds) {
        this.nbreDePieds = nbreDePieds;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Je suis une chaise avec "+ nbreDePieds +" pied(s) en " + materiaux +" de couleur " + couleur + " à un prix de "+prix;
    }
}
