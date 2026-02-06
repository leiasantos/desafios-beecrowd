package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("** Distância Entre Dois Pontos **");

        System.out.print("Digite x1: ");
        double x1 = scan.nextDouble();

        System.out.print("Digite y1: ");
        double y1 = scan.nextDouble();

        System.out.print("Digite x2: ");
        double x2 = scan.nextDouble();

        System.out.print("Digite y2: ");
        double y2 = scan.nextDouble();


        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf(" %.4f%n", distancia);



        scan.close();
    }
}
