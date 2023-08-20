
// Problema "soma_vetor"
// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor
// Exemplo:
// Quantos numeros voce vai digitar? 4
// Digite um numero: 8.0
// Digite um numero: 4.0
// Digite um numero: 10.0
// Digite um numero: 14.0
// VALORES = 8.0 4.0 10.0 14.0
// SOMA = 36.00
// MEDIA = 9.00

import java.util.Scanner;

public class J02SomaVetores {
  public static void main(String[] args) {

    int N;
    double soma, media, num;
    Scanner input = new Scanner(System.in);

    System.out.print("Quantos numeros vai digitar? ");
    N = input.nextInt();

    double[] nums = new double[N];
    double length = nums.length;

    soma = 0;
    for (int i = 0; i < length; i++) {

      System.out.print("Digite um numero: ");
      num = input.nextDouble(); 
      nums[i] = num;
      soma += num;
    }

    media = soma / length;

    System.out.print("VALORES = ");
    for (int j = 0; j < length; j++) {
      System.out.print(nums[j] + "  ");
    }

    System.out.printf("%nSOMA = %.2f%n", soma);
    System.out.printf("MEDIA = %.2f", media);

    input.close();
  }
}
