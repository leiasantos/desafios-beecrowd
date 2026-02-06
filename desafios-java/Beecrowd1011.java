package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1011 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("*** Calculando o volume de uma esfera ***");
        System.out.println("Digite o valor do raio: ");
        double raio = scan.nextDouble();

        double PI = 3.14159;

        double volume = (4.0 / 3) * PI * (Math.pow(raio, 3));

        System.out.printf("VOLUME =  R$ %.3f", volume);
    }
}
