// MEDIA IDADES

// Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
// indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
// e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
// mostrar a mensagem "IMPOSSIVEL CALCULAR".

// Exemplo 1:
// Digite as idades:
// 31
// 27
// 46
// -5
// MEDIA = 34.67

// Exemplo 2:
// Digite as idades:
// -10
// IMPOSSIVEL CALCULAR 

import java.util.Scanner;

public class j02mediaIdades {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int idade, somaIdades, pessoas;
    double media;

    System.out.println("Digite as idades: ");
    idade = entrada.nextInt();

    if (idade < 0) {

      System.out.println("IMPOSSIVEL CALCULAR");

    } else {

      pessoas = 0;
      somaIdades = 0;

      while (idade > 0) {

        pessoas++;
        somaIdades += idade;

        idade = entrada.nextInt();
      }

      media = somaIdades / pessoas;
      
      System.out.printf("%nMEDIA %.2f\n", media);
    }


    entrada.close();

  }
}
