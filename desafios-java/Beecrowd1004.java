package com.curso.java.beecrowd;

import java.util.Scanner;

public class Beecrowd1004 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = scan.nextInt();

        System.out.println("Digite um segundo numero inteiro: ");
        int num1 = scan.nextInt();

        int prod = num * num1;
        System.out.println("PROD = " + prod);


        System.out.println("");
    }
}
