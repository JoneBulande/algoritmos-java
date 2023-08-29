
// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
// o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
// considerando a primeira posição como 0 (zero). 

// Exemplo:
// Quanto numeros voce vai digitar? 6
// Digite um numero: 8.0
// Digite um numero: 4.0
// Digite um numero: 10.0
// Digite um numero: 14.0
// Digite um numero: 13.0
// Digite um numero: 7.0
// MAIOR VALOR = 14.0
// POSICAO DO MAIOR VALOR = 3

import java.util.Scanner;

public class J05Maior_posicao {
  public static void main(String[] args) {

    int N, posicao = 0;
    double num, maior = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    N = sc.nextInt();

    double[] numbers = new double[N];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um numero: ");
      num = sc.nextDouble();

      numbers[i] = num;

      if (num > maior) {
        maior = num;
        posicao = i;
      }

    }

    System.out.println("MAIOR VALOR = " + maior);
    System.out.println("POSISCAO DO MAIOR VALOR = " + posicao);

    sc.close();
  }
}