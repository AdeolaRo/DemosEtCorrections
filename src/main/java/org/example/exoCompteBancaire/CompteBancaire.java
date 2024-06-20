package org.example.exoCompteBancaire;
import java.util.*;


public abstract class CompteBancaire {

    protected double solde = 0;
    protected String client;
    protected List <Operation> operationlist;


    public CompteBancaire(double solde, String client) {
        this.solde = solde;
        this.client = client;
        this.operationlist = new ArrayList<>();
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setOperationlist(List<Operation> operationlist) {
        this.operationlist = operationlist;
    }
    public List<Operation> getOperationlist() {
        return operationlist;
    }

    public void ajoutOperation(Operation operation){

        switch (operation.getStatut()) {
            case DEPOT -> ajoutArgent(operation);
            case RETRAIT -> retraitArgent(operation);
        }
    }


    public void ajoutArgent (Operation operation){
        solde = solde + operation.getMontant();
            }
    public void retraitArgent (Operation operation){
        solde = solde - operation.getMontant();
            }



    @Override
    public String toString() {
        return super.getClass().getSimpleName() +
                " solde = " + solde +
                ", du client = '" + client + '\'';
    }
}
