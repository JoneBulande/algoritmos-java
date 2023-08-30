
// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
// mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
// os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
// Exemplo:
// Quantos elementos vai ter o vetor? 4
// Digite um numero: 10.0
// Digite um numero: 15.5
// Digite um numero: 13.2
// Digite um numero: 9.8
// MEDIA DO VETOR = 12.125
// ELEMENTOS ABAIXO DA MEDIA:
// 10.0
// 9.8 

import java.util.Scanner;

public class J07AbaixoDaMedia {
  public static void main(String[] args) {
    
    int N, cont = 0;
    double media, soma = 0, nota;
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    N = sc.nextInt();

    double[] notas = new double[N];

    for (int i = 0; i < N; i++) {
      System.out.print("Digite um numero: ");
      nota = sc.nextDouble();
      notas[i] = nota;
      soma += nota;
      cont += 1;
    }

    media = soma / cont;

    System.out.println("MEDIA DO VETOR = " + media);

    System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
    for (int j = 0; j < N; j++) {
      if (notas[j] < media) {
        System.out.println(notas[j]);
      }
    }

    

  }
}
