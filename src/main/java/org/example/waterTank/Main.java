package org.example.waterTank;

public class Main {
    public static void main(String[] args) {

        WaterTank watertank1 = new WaterTank(10, 20, 10);
        WaterTank watertank2 = new WaterTank(10, 10, 5);

        System.out.println("Poids total de la citerne 1 : " + watertank1.getVolumeTotal());
        System.out.println("Poids total de la citerne 2 : " + watertank2.getVolumeTotal());

        System.out.println("Poids total de la citerne 2 : " + watertank2);

        watertank2.vider(5);

        System.out.println("Poids total de la citerne 2 : " + watertank2);

        System.out.println("----------------------");
    }
}


