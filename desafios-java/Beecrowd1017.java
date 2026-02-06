package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("** Gasto de Combustível **");

        int tempo = scan.nextInt();
        int velocidade = scan.nextInt();

        double litros = (tempo * velocidade) / 12.0;
        System.out.printf(" %.3f%n" , litros);

        scan.close();
    }
}
