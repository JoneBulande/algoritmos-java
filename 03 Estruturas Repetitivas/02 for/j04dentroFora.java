// DENTRO FORA

// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
// conforme exemplo 

// Exemplo:
// Quantos numeros voce vai digitar? 5
// Digite um numero: 14
// Digite um numero: 35
// Digite um numero: 10
// Digite um numero: 131
// Digite um numero: 8

// 2 DENTRO
// 3 FORA 

import java.util.Scanner;

public class j04dentroFora {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int N, x, dentro, fora;

    System.out.print("Quantos numeros voce vai digitar? ");
    N = entrada.nextInt();

    fora = 0;
    dentro = 0;
    for (int i = 0; i < N; i++) {

      System.out.print("Digite um numero: ");
      x = entrada.nextInt();

      if (x >= 10 && x <= 20) {
        dentro++;
      } else {
        fora++;
      }

    }

    System.out.printf("%d DENTRO\n%d FORA\n", dentro, fora);

    entrada.close();
  }
}
