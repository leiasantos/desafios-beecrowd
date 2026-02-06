package com.curso.java.beecrowd;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Beecrowd1013 {
  public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner scan = new Scanner(System.in);

      System.out.println("*** Programa O Maior *** ");

      int A = scan.nextInt();
      int B = scan.nextInt();
      int C = scan.nextInt();


      int maiorAB = (A + B + Math.abs(A - B)) / 2;


      int maior = (maiorAB + C + Math.abs(maiorAB - C)) / 2;


      System.out.println(maior + " eh o maior");

      scan.close();


  }

}
