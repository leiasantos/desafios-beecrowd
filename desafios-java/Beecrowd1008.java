package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de um funcionário");
        int numF = scan.nextInt();

        System.out.println("Digite o número de horas trabalhadas");
        int numH = scan.nextInt();

        System.out.println("Digite o valor que recebe por hora trabalhada");
        double valHora = scan.nextDouble();

        double salario = numH * valHora ;

        System.out.println("NUMBER = " + numF);
        System.out.printf("SALARY = U$ %.2f", salario);




        System.out.print("");

        System.out.print("");
    }
}
