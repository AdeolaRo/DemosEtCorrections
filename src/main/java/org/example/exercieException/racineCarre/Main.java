package org.example.exercieException.racineCarre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String saisie;

        while (true) {
            System.out.print("Veuillez saisir un nombre entier positif : ");

            try {
                saisie = scanner.nextLine();
                int valeur = Integer.parseInt(saisie); // Convertit la chaîne en int
                if (valeur < 0) {
                    throw new RuntimeException();
                }
                System.out.println("La racine carré de "+valeur+" est : "+Math.sqrt(valeur));
            } catch (NumberFormatException e) {
                System.out.println("Ceci n'est pas un nombre entier");
                continue;
            } catch (Exception e) {
                System.out.println("Saisie incorrecte ! (négatif) ");
                continue;
            }
            break;

        }

    }
}
