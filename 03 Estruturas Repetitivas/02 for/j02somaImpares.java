
// Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
// impares entre eles.

// Exemplo 1:
// Digite dois numeros:
// 2
// 9
// SOMA DOS IMPARES = 15 

import java.util.Scanner;

public class j02somaImpares {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int x, y, troca, soma;

    System.out.println("Digite dois numeros: ");
    x = entrada.nextInt();
    y = entrada.nextInt();

    if (x > y) {
      troca = x;
      x = y;
      y = troca;
    }

    soma = 0;
    for (int i = x; i < y; i++) {

      if (i % 2 != 0) {
        soma += i;
      }

    }

    System.out.printf("SOMA DOS INTEIROS = %d\n", soma);

    entrada.close();
  }
}
