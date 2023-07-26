// PAR IMPAR

// Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
// Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
// se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
// apenas NULO.

// Exemplo:
// Quantos numeros voce vai digitar? 4
// Digite um numero: -5
// IMPAR NEGATIVO
// Digite um numero: 0
// NULO
// Digite um numero: 3
// IMPAR POSITIVO
// Digite um numero: -4
// PAR NEGATIVO

import java.util.Scanner;

public class j05parImpar {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int N, x;

    System.out.print("Quantos numeros voce vai digitar? ");
    N = entrada.nextInt();

    for (int i = 0; i < N; i++) {
      
      System.out.print("Digite um numero: ");
      x = entrada.nextInt();

      if (x == 0 ){
        System.out.println("NULO");
      }
      
      else if (x % 2 == 0) {
        if (x > 0) {
          System.out.println("PAR POSITIVO");
        } else {
          System.out.println("PAR NEGATIVO");
        }
        
      } else {
        if (x > 0) {
          System.out.println("IMPAR POSITIVO");
        } else {
          System.out.println("IMPAR NEGATIVO");
        }
      }
    }


    entrada.close();
  }
}
