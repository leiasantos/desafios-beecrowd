package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1002 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = scan.nextDouble();

        double PI = 3.14159;
        double area = PI * raio * raio;


        System.out.printf("%.4f\n", area);
    }

}
