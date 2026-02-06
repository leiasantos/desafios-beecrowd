package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double notaA = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double notaB = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double notaC = scan.nextDouble();

        double media = (notaA * 2 +  notaB * 3  + notaC * 5) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
