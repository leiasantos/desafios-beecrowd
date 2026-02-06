package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1019 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("** Conversão de Tempo **");

        System.out.print("Digite um valor inteiro: ");
        int totalSegundos = scan.nextInt();;

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = (totalSegundos % 3600) % 60;

        System.out.printf("%d:%02d:%02d%n", horas, minutos, segundos);

        scan.close();
    }
}
