package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1020 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("** Idade em Dias **");

        System.out.println("Digite um valor inteiro ");
        int totalDias = scan.nextInt();

        int anos =  totalDias / 365;
        int resto = totalDias % 356;

        int meses = resto / 30;
        int dias = resto % 30;


        System.out.println(anos + " ano(s) \n"+ meses+" mes(s) \n"+ dias+" dia(s)" );
    }
}
