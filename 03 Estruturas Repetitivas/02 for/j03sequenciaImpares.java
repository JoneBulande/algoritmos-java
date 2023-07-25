
// Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
// se for o caso. 

// Exemplo:
// Digite o valor de X: 8
// 1
// 3
// 5
// 7 

import java.util.Scanner;

public class j03sequenciaImpares {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int x;

    System.out.print("Digite o valor de X: ");
    x = entrada.nextInt();

    for (int i = 1; i <= x; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    entrada.close();

  }
}
