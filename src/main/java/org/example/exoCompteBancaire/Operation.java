package org.example.exoCompteBancaire;

public class Operation {

   private long numero;
   private double montant;
   private DepotRetrait statut;

    public Operation(long numero, double montant) {
        this.numero = numero;
        this.montant = montant;
        this.statut = getStatut();

        }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public DepotRetrait getDepot() {
        return statut;
    }
    public void setDepot(DepotRetrait depot) {
        this.statut = depot;
    }

    public DepotRetrait getRetrait() {
        return statut;
    }
    public void setRetrait(DepotRetrait Retrait) {
        this.statut = Retrait;
    }

    public DepotRetrait getStatut() {
        return statut;
    }

    public void setStatut(DepotRetrait statut) {
        this.statut = statut;
    }
}
