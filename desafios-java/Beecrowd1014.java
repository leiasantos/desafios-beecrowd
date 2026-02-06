package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Programa calculando o Consumo");

        System.out.println("Digite a distância total percorrida (inteiro, em km)");
        double dist = scan.nextDouble();

        System.out.println("Digite o total de combustível gasto (real, em litros)");
        double combust = scan.nextDouble();

        double consumo = dist / combust;


        System.out.printf("%.3f km/l%n", consumo);

        scan.close();

    }
}
