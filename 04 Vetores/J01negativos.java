
// Faça um programa que leia um número int

//  Exemplo:
// Quantos numeros voce vai digitar? 6
// Digite um numero: 8
// Digite um numero: -2
// Digite um numero: 9
// Digite um numero: 10
// Digite um numero: -3
// Digite um numero: -7
// NUMEROS NEGATIVOS:
// -2
// -3
// -7 

import java.util.Scanner;

public class J01negativos {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int N;

    System.out.print("Informe quantos numeros voce vai digitar: ");
    N = input.nextInt();

    int[] vetNums = new int[N];

    for (int i = 0; i < N; i++) {

      System.out.print("Digite um numero: ");
      vetNums[i] = input.nextInt();

    }

    System.out.println("NUMEROS NEGATIVOS: ");
    for (int j = 0; j < vetNums.length; j++) {

      if (vetNums[j] < 0) {
        System.out.println(vetNums[j]);
      }
    }

    input.close();

  }
}

