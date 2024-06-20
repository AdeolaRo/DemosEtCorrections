package org.example.exoCompteBancaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    private String nom;
    private String prenom;
    private int identifiant;
    private String telephone;
    private List<CompteBancaire> listeDeCompte;


    public Client(String nom, String prenom, int identifiant, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.telephone = telephone;
        this.listeDeCompte = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setListeDeCompte(List<CompteBancaire> listeDeCompte) {
        this.listeDeCompte = listeDeCompte;
    }

    public List<CompteBancaire> getListeDeCompte() {
        return listeDeCompte;
    }

    public void add(CompteBancaire compteBancaire) {
//       listeDeCompte[listeDeCompte.length-1] = compteBancaire;
        listeDeCompte.add(compteBancaire);

    }


    @Override
    public String toString() {
        return super.getClass().getSimpleName() +
                " Nom = '" + nom + '\'' +
                ", Prenom = '" + prenom + '\'' +
                ", Identifiant = " + identifiant +
                ", Télephone = '" + telephone + '\'' +
                ", liste De Compte = " + listeDeCompte;
    }


}







