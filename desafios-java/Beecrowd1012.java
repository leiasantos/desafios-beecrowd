package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("*** Calculando Área ***");

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double areaTriangulo = (A * C) / 2.0;

        double PI = 3.14159;
        double areaCirculo = PI * C * C;

        double areaTrapezio = ((A + B) * C) / 2.0;

        double areaQuadrado = B * B;

        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}
