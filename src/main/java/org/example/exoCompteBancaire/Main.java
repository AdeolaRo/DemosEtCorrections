package org.example.exoCompteBancaire;

public class Main {

    public static void main(String[] args) {

        Client c1 = new Client("Julien", "John Doe", 12, "0729194805");
        Client c2 = new Client("hector", "Jules", 22, "0699194805");

        System.out.println();
        System.out.println();
        System.out.println(c1);
        System.out.println();
        System.out.println("--------------------------------------------");

       CompteBancaire julienEpargne = new CompteEpargne(5000, "Julien");

        CompteBancaire julienPayant = new ComptePayant(6000, "Julien");

//        CompteBancaire hectorPayant = new ComptePayant(10000, "hector");


        System.out.println();
        System.out.println(julienEpargne);
        System.out.println();
        System.out.println("--------------------------------------------");

        // Associer Julien épargne à Client C1

        c1.add(julienEpargne);

         c1.add(julienPayant);  //        c2.add(hectorPayant);

        System.out.println();
        System.out.println(c1);
        System.out.println();
        System.out.println("--------------------------------------------");

        // Créer une nouvelle opération

        Operation operation1 = new Operation(2,2000);
        Operation operation2 = new Operation(3,200);

        // Effectuer un retrait du compte Julien épargne et un ajout

        julienEpargne.retraitArgent(operation1);
        julienEpargne.ajoutArgent(operation2);


        System.out.println();
        System.out.println(julienEpargne);
        System.out.println();
        System.out.println("--------------------------------------------");


        System.out.println();

    }
}
