// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
// tela todos os números pares, e também a quantidade de números pares. 

import java.util.Scanner;

public class J04Numeros_pares {
  public static void main(String[] args) {

    int N, num, pares;
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros vai digitar? ");
    N = sc.nextInt();

    int[] numeros = new int[N];

    for (int i = 0; i < N; i++) {
      System.out.print("Digite um numero: ");
      num = sc.nextInt();

      numeros[i] = num;

    }

    pares = 0;
    System.out.println("\nNUMEROS PARES: ");
    for (int i = 0; i < N; i++) {
      if (numeros[i] % 2 == 0) {
        System.out.print(numeros[i] + " ");
        pares += 1;
      }
    }

    System.out.println("\n\nQUANTIDADE DE PARES: " + pares);

    sc.close();

  }
}