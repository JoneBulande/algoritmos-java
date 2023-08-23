// Fazer um programa para ler nome, idade e altura de N pessoas. Depois, mostrar na
// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver. 

import java.util.Scanner;

public class J03Alturas {

  public static void main(String[] args) {

    int N, menores16;
    Scanner entrada = new Scanner(System.in);
    double somaAlturas, alturaMedia, percentualMenores;

    System.out.print("Quantas pessoas serao inseridas? ");
    N = entrada.nextInt();

    String[] nomes = new String[N];
    int[] idades = new int[N];
    double[] alturas = new double[N];

    for (int i = 0; i < N; i++) {

      System.out.println("Dados da " + (i + 1) + "a pessoa");

      System.out.print("Nome: ");
      nomes[i] = entrada.next();

      System.out.print("Idade: ");
      idades[i] = entrada.nextInt();

      System.out.print("Altura: ");
      alturas[i] = entrada.nextDouble();

    }

    menores16 = 0;
    somaAlturas = 0;

    for (int j = 0; j < N; j++) {

      if (idades[j] < 16) {
        menores16 += 1;
      }

      somaAlturas += alturas[j];

    }

    alturaMedia = somaAlturas / N;
    percentualMenores = ((double) menores16 / N) * 100.0;

    System.out.printf("Altura media: %.2f\n", alturaMedia);
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

    for (int i = 0; i < N; i++) {
      if (idades[i] < 16) {
        System.out.printf("%s\n", nomes[i]);
      }
    }

    entrada.close();
  }

}