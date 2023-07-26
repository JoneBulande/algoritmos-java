// EXPERIENCIAS

// Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
// organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
// quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este
// laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
// informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
// utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um
// valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um
// inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
// de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
// cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
// percentual deve ser apresentado com dois dígitos após o ponto. 

// Exemplo:
// Quantos casos de teste serao digitados? 10
// Quantidade de cobaias: 10
// Tipo de cobaia: C
// Quantidade de cobaias: 6
// Tipo de cobaia: R
// Quantidade de cobaias: 15
// Tipo de cobaia: S
// Quantidade de cobaias: 5
// Tipo de cobaia: C
// Quantidade de cobaias: 14
// Tipo de cobaia: R
// Quantidade de cobaias: 9
// Tipo de cobaia: C
// Quantidade de cobaias: 6
// Tipo de cobaia: R
// Quantidade de cobaias: 8
// Tipo de cobaia: S
// Quantidade de cobaias: 5
// Tipo de cobaia: C
// Quantidade de cobaias: 14
// Tipo de cobaia: R
// RELATORIO FINAL:
// Total: 92 cobaias
// Total de coelhos: 29
// Total de ratos: 40
// Total de sapos: 23
// Percentual de coelhos: 31.52
// Percentual de ratos: 43.48
// Percentual de sapos: 25.00 

import java.util.Scanner;

public class j09experiencias {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    double perceCoelho, perceRatos, perceSapos;
    int N, coelhos, ratos, sapos, somaCobaias, quantidadeCobaias;
    char tipoCobaias;

    System.out.print("Quantos casos de teste serão digitados? ");
    N = entrada.nextInt();

    ratos = 0;
    sapos = 0;
    coelhos = 0;
    somaCobaias = 0;

    for (int i = 0; i < N; i++) {

      System.out.print("Quantidade de cobaias: ");
      quantidadeCobaias = entrada.nextInt();

      somaCobaias += quantidadeCobaias;

      System.out.print("Tipo de cobaias: ");
      tipoCobaias = entrada.next().charAt(0);

      switch (tipoCobaias) {
        case 'c':
          coelhos += quantidadeCobaias;
          break;
        case 'r':
          ratos += quantidadeCobaias;
          break;
        case 's':
          sapos += quantidadeCobaias;
          break;
      }

    }

    perceCoelho = ((double) coelhos / somaCobaias) * 100.0;
    perceRatos = ((double) ratos / somaCobaias) * 100.0;
    perceSapos = ((double) sapos / somaCobaias) * 100.0;

    System.out.println("RELATORIO FINAL:");
    System.out.printf("Total: %d\nTotal de coelhos: %d\nTotal de ratos: %d\nTotal de sapos: %d\n", somaCobaias,
        coelhos, ratos, sapos);
    System.out.printf("Percetual de coelhos: %.2f\nPercetual de ratos: %.2f\nPercetual de sapos: %.2f\n",
        perceCoelho, perceRatos, perceSapos);

    entrada.close();
  }
}
