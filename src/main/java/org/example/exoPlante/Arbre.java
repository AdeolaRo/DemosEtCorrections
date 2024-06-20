package org.example.exoPlante;

public class Arbre extends Plante{

    private double circonference;


    public Arbre(String nom, double hauteur, String couleur, double circonferance) {
        super(nom, hauteur, couleur);
        this.circonference = circonferance;
    }

    public double getCirconference() {
        return circonference;
    }

    public void setCirconference(double circonference) {
        this.circonference = circonference;
    }


    @Override
    public String toString() {
        return super.toString() + circonference;
    }
}
