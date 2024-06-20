package org.example.joueur;

public class Main {

    public static void main(String[] args) {

        Joueur joueur1 = new Joueur("abdel", 1, 87,0);
        Joueur joueur2 = new Joueur();

        // effectuer une quete
        joueur1.effectuerUneQuete();
        System.out.println(joueur1);

        joueur2.effectuerUneQuete();
        System.out.println(joueur2);

        System.out.println();

        System.out.println("Niveau du joueur 1 est : "+ joueur1.getNiveau() + " et son expérience est " + joueur1.getPointExperience());

        System.out.println();

        joueur1.effectuerUneQuete();
        System.out.println(joueur1);

        System.out.println();

        System.out.println("Niveau du joueur 1 est : "+ joueur1.getNiveau() + " et son expérience est " + joueur1.getPointExperience());

    }
}
