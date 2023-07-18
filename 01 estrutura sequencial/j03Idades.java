
// Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
// nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo. 

import java.util.Scanner;

public class j03Idades {
  public static void main(String[] args) {
    
    String nome1, nome2;
    int idade1, idade2;
    double media;

    Scanner input = new Scanner(System.in);
    
    System.out.println("Dados da primeira pessoa: ");
    System.out.print("Nome: ");
    nome1 = input.nextLine();
    
    System.out.print("Idade: ");
    idade1 = input.nextInt();
    
    System.out.println("Dados da segunda pessoa: ");
    System.out.print("Nome: ");
    input.nextLine(); // --------------> limpeza de buffer
    nome2 = input.nextLine();
    
    System.out.print("Idade: ");
    idade2 = input.nextInt();

    // 
    media =(idade1 + idade2) / 2;

    System.out.printf("%nA idade media de %s e %s e de %.1f anos%n", nome1, nome2, media);
    
    input.close();
  }
}
