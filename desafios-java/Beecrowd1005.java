package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double notaA = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double notaB = scan.nextDouble();

        double media = (notaA * 3.5 +  notaB * 7.5 ) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
