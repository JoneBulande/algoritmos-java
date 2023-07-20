
// Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
// números podem ser digitados em qualquer ordem. 

import java.util.Scanner;

public class j10Multiplos {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int x, y;

    System.out.println("Digite dois numeros inteiros: ");
    x = entrada.nextInt();
    y = entrada.nextInt();

    if (x % y == 0 || y % x == 0) {

      System.out.println("Sao multiplos");

    } else {

      System.out.println("Nao sao multiplos");
    }

    entrada.close();
  }
}
