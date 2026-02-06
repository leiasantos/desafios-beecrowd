package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Vendedor: ");
        String nomeVendedor = scan.next();

        System.out.println("Digite o valor do salário fixo: ");
        double salarioFixo = scan.nextDouble();

        System.out.println("Digite o total de vendas efetuadas no mês");
        double totalVendas = scan.nextDouble();

        double totalSalario = (totalVendas * 0.15) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f", totalSalario);


        System.out.println("");

        System.out.println("");
    }
}

