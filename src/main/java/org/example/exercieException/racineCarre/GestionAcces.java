package org.example.exercieException.racineCarre;

public class GestionAcces {

    public static void main(String[] args) {

        int[] tableau = {1, 2, 3, 4, 5};

        try {
            System.out.println(tableau[9]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Le tableau ne comporte que 5 éléments");
        }

    }
}
