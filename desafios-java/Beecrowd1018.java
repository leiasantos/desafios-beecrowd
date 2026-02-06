package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1018 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("** Cédulas **");


        try {
            int valorN = scan.nextInt();

            if (valorN <= 0 || valorN >= 1000000) {
                System.out.println("Erro: o valor deve ser maior que 0 e menor que 1.000.000.");
                return; // encerra o programa
            }

            int valorOriginal = valorN;
            System.out.println(valorOriginal);

            int[] notas = {100, 50, 20, 10, 5, 2, 1};

            for (int nota : notas) {
                int quantidade = valorN / nota;
               valorN = valorN % nota;
                System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            }

          }catch (Exception e) {
            System.out.println("Presentation Error");}
        }

    }

