// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
// terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
// o vetor C gerado.
// Exemplo:
// Quantos valores vai ter cada vetor? 6
// Digite os valores do vetor A:
// 8
// 2
// 11
// 14
// 13
// 20
// Digite os valores do vetor B:
// 5
// 10
// 3
// 1
// 10
// 7
// VETOR RESULTANTE:
// 13
// 12
// 14
// 15
// 23
// 27 

import java.util.Scanner;

public class J06SomaVetores {
  public static void main(String[] args) {

    int N, num;
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos vai conter cada elemento? ");
    N = sc.nextInt();

    int[] A = new int[N];
    int[] B = new int[N];

    System.out.println("Digite os valores de A: ");
    for (int i = 0; i < N; i++) {
      num = sc.nextInt();
      A[i] = num;
    }

    System.out.println("Digite os valores de B: ");
    for (int j = 0; j < N; j++) {
      num = sc.nextInt();
      B[j] = num;
    }

    System.out.println("VETOR RESULTANTE: ");
    for (int k = 0; k < N; k++) {
      System.out.println(A[k] + B[k]);
    }

    sc.close();
  }
}
