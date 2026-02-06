package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("** Distância **");
        System.out.print("Digite a distância em km: ");
        int distancia = scan.nextInt();


        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");

        scan.close();
    }
}
