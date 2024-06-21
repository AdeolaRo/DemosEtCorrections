package org.example.exercieException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String saisie;

        while (true){
            System.out.print( "Veuillez saisir une chaine de caractère : ");

        try {
            saisie = scanner.nextLine();
            int valeur = Integer.parseInt(saisie); // Convertit la chaîne en int

            if(valeur<0){                           //Si valeur négatif, crée une nouvelle exception
                throw new RuntimeException();
            }
            System.out.println(valeur);
        }
        catch (NumberFormatException e){
                System.out.println("Ceci n'est pas un nombre");
                continue;
        } catch (Exception e) {
                System.out.println("Saisie incorrecte ! (négatif) ");
                continue;
            }
            break;
        }










    }
}
