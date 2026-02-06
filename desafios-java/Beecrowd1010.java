package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o código da peça 1: ");
        int codigoPeca1 = scan.nextInt();

        System.out.println("Digite a quantidade da peça 1: ");
        int qtd1 = scan.nextInt();

        System.out.println("Digite o valor unitário da peça 1: ");
        double valor1 = scan.nextDouble();


        System.out.println("Digite o código da peça 2: ");
        int codigoPeca2 = scan.nextInt();

        System.out.println("Digite a quantidade da peça 2: ");
        int qtd2 = scan.nextInt();

        System.out.println("Digite o valor unitário da peça 2: ");
        double valor2 = scan.nextDouble();

        double valorASerPago = (qtd1 * valor1) + (qtd2 * valor2);

        System.out.printf("VALOR A PAGAR = R$ %.2f", valorASerPago);


    }
}
