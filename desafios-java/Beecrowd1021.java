package com.curso.java.beecrowd;

import java.util.Scanner;

public class Beecrowd1021 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valor = scan.nextDouble();
        scan.close();

        int valorCentavos = (int) Math.round(valor * 100);

        // Notas
        System.out.println("NOTAS:");
        int[] notas = {100, 50, 20, 10, 5, 2};
        for (int nota : notas) {
            int quantidade = valorCentavos / (nota * 100);
            valorCentavos = valorCentavos % (nota * 100);
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, (double) nota);
        }

        // Moedas
        System.out.println("MOEDAS:");
        int[] moedas = {100, 50, 25, 10, 5, 1};
        for (int moeda : moedas) {
            int quantidade = valorCentavos / moeda;
            valorCentavos = valorCentavos % moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);
        }
    }
    }

