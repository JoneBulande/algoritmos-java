// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
// aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
// digitado, mostrar a mensagem "NENHUM NUMERO PAR"

// Exemplo 1:
// Quantos elementos vai ter o vetor? 6
// Digite um numero: 8
// Digite um numero: 2
// Digite um numero: 11
// Digite um numero: 14
// Digite um numero: 13
// Digite um numero: 20
// MEDIA DOS PARES = 11.0

// Exemplo 2:
// Quantos elementos vai ter o vetor? 3
// Digite um numero: 7
// Digite um numero: 9
// Digite um numero: 11
// NENHUM NUMERO PAR 


import java.util.Scanner;

public class J08MediaPares {
  public static void main(String[] args) {
    
    
    double media;
    int N, soma = 0, num, contPares = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    N = sc.nextInt();

    double[] vet = new double[N];

    for (int i = 1; i <= vet.length; i++) {
      System.out.print("Digite um numero: ");
      num = sc.nextInt();
      if (num % 2 == 0) {
        soma += num;
        contPares += 1;
      }
    }

    if (contPares != 0) {
      media = soma / contPares;
      System.out.println("A MEDIA DOS PARES: " + media);
    } else {
      System.out.println("NENUM NUMERO PAR");
    }

    sc.close();
    

  }
}
