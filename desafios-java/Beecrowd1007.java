package com.curso.java.beecrowd;

import java.util.Scanner;

public class Beecrowd1007 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int A = scan.nextInt();

        System.out.println("Digite um segundo número inteiro: ");
        int B = scan.nextInt();

        System.out.println("Digite um terceiro número inteiro: ");
        int C = scan.nextInt();

        System.out.println("Digite um quarto número inteiro: ");
        int D = scan.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = "+ diferenca);

       scan.close();
    }
}
