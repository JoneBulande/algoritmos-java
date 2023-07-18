
// Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
// O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
// e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
// mostrar o valor do troco a ser devolvido ao cliente.

import java.util.Scanner;

public class j05Troco {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double precoProduto, dinheiroRecebido, troco;
    int quantidadeComprada;

    System.out.print("Digite o preço unitário do produto: ");
    precoProduto = input.nextDouble();
    
    System.out.print("Digite a quantidade comprada: ");
    quantidadeComprada = input.nextInt();
    
    System.out.print("Digite o dinheiro recebido: ");
    dinheiroRecebido = input.nextDouble();

    troco = dinheiroRecebido - (quantidadeComprada * precoProduto);

    System.out.printf("%nTROCO = %.2f%n", troco);

    input.close();

  }
}
