// DIVISAO

// Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo
// segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.

// Exemplo:
// Quantos casos voce vai digitar? 3
// Entre com o numerador: 3
// Entre com o denominador: -2
// DIVISAO = -1.50 
// Entre com o numerador: -8
// Entre com o denominador: 0
// DIVISAO IMPOSSIVEL

import java.util.Scanner;

public class j07divisao {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int N, x, y;
    double divisao;

    System.out.print("Quantos casos voce vai digitar? ");
    N = entrada.nextInt();

    for (int i = 0; i < N; i++) {

      System.out.print("Entre com o numerorador: ");
      x = entrada.nextInt();

      System.out.print("Entre com o denominador: ");
      y = entrada.nextInt();

      if (y == 0) {

        System.out.println("DIVISAO IMPOSSIVEL");

      } else {

        divisao = (double) x / y;
        System.out.printf("DIVISAO = %.2f\n", divisao);

      }

    }

    entrada.close();
  }
}
