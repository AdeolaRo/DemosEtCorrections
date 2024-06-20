package org.example.chaise;

public class Main {

    public static void main(String[] args) {

        Chaise ch1 = new Chaise(4,"chaine", "bleu", 14.4);
        Chaise ch2 = new Chaise(3,"bambou", "gris", 130.99);
        Chaise ch3 = new Chaise(1,"metal", "orange",76.25);
        Chaise ch4 = new Chaise();


        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
    }
}


