
// Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
// mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
// programa deve finalizar quando forem digitados dois valores iguais. 

// Exemplo:

// Digite dois numeros:
// 5
// 4
// DECRESCENTE!

// Digite outros dois numeros:
// 3
// 8
// CRESCENTE!

// Digite outros dois numeros:
// 2
// 2

import java.util.Scanner;

public class j01crescente {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int x, y;

    System.out.println("Digite dois números: ");
    x = entrada.nextInt();
    y = entrada.nextInt();

    while (x != y) {

      if (x > y) {

        System.out.println("CRESCENTE");

      } else {

        System.out.println("DECRESCENTE");

      }

      System.out.println("Digite outros dois números: ");
      x = entrada.nextInt();
      y = entrada.nextInt();

    }

    entrada.close();

  }
}