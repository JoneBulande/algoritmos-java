
// FATORIAL

// Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
// fatorial de N. 

// Exemplo 1:
// Digite o valor de N: 4
// FATORIAL = 24

// Exemplo 2:
// Digite o valor de N: 0
// FATORIAL = 1 

import java.util.Scanner;

public class j08fatorial {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    int N, fatorial;
    
    System.out.print("Digite o valor de N: ");
    N = entrada.nextInt();

    fatorial = 1;
    for (int i = N; i > 0; i-- ) {
      fatorial = fatorial * i;
    }

    System.out.printf("FATORIAL = %d\n", fatorial);

    entrada.close();
  }
}
