package org.example.film;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

Film f1 = new Film("Rambo", "David Morel", LocalDate.of(2010, 7, 16), "Action");
Film f2 = new Film("Prise", "Dawn Pall", LocalDate.of(1980, 12, 1), "Drame");

        System.out.println(f1);
        System.out.println(f2);
    }

}
