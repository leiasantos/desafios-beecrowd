package com.curso.java.beecrowd;

import java.util.Scanner;

public class Beecrowd1001 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int A = scan.nextInt();

        System.out.println("Digite um segundo número");
        int B = scan.nextInt();

        int soma =  A + B;
        System.out.printf("X = %d%n", soma);

        scan .close();

    }
}
