package org.example.waterTank;

public class WaterTank {

    private double poidsAVide;
    private double capaciteMaximale;
    private double niveauRemplissage;
    private double niveau;
    private double volume;

    private static double volumeTotal = 0;


    public static double getVolumeTotal() {
        return volumeTotal;
    }

    public static void setVolumeTotal(double volumeTotal) {

        WaterTank.volumeTotal = volumeTotal;
    }


    public WaterTank(double poidsAVide, double capaciteMaximale, double niveauRemplissage) {
        volumeTotal += niveauRemplissage;
        this.poidsAVide = poidsAVide;
        this.volume = volume;
        this.capaciteMaximale = capaciteMaximale;
        this.niveauRemplissage = niveauRemplissage;

    }

    public void remplir(double ajout) {
        if (niveauRemplissage + ajout <= capaciteMaximale) {
            this.niveauRemplissage = niveauRemplissage + ajout;
            volumeTotal = niveauRemplissage + ajout;
        } else{
            double exces = ((niveauRemplissage + ajout) - capaciteMaximale);

            System.out.println("Le tank de niveau total est "+ capaciteMaximale);
            System.out.println("Excès d'eau = "+ exces);
        }

    }

    public double vider(double retrait) {
        if (niveauRemplissage >= retrait) {
            volumeTotal = this.niveauRemplissage - retrait;
            } else {
            volumeTotal -= niveauRemplissage;

        }
        System.out.println(retrait);
        return  retrait;
    }


    // Getters

    public double getVolume() {
        return volume;
    }

    public double getNiveau() {
        return niveau;
    }

    public double getCapaciteMaximale() {
        return capaciteMaximale;
    }

    public double getNiveauRemplissage() {
        return niveauRemplissage;
    }

    // Setter

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setCapaciteMaximale(int capaciteMaximale) {
        this.capaciteMaximale = capaciteMaximale;
    }

    public void setNiveauRemplissage(int niveauRemplissage) {
        this.niveauRemplissage = niveauRemplissage;
    }

    @Override
    public String toString() {
        return "WaterTank{" +
                "poids A Vide =" + poidsAVide +
                ", capacite Maximale =" + capaciteMaximale +
                ", niveau Remplissage =" + niveauRemplissage +
                ", niveau =" + niveau +
                ", volume =" + volume +
                '}';

    }
}