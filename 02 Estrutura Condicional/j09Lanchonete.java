
// Uma lanchonete possui vários produtos. Cada produto possui um código
// e um preço. Você deve fazer um programa para ler o código e a
// quantidade comprada de um produto (suponha um código válido), e daí
// informar qual o valor a ser pago, com duas casas decimais, conforme
// tabela de produtos abaixo. 

// Código        Preço
// do produto    do produto 

// 1              5.00 MZN
// 2              3.50 MZN
// 3              4.80 MZN
// 4              8.90 MZN
// 5              7.32 MZN

import java.util.Scanner;

public class j09Lanchonete {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    double valorAPagar;
    int codigoDoProduto, quantidadeComprada;

    System.out.print("Codigo do produto comprado: ");
    codigoDoProduto = entrada.nextInt();

    System.out.print("Quantidade comprada: ");
    quantidadeComprada = entrada.nextInt();

    valorAPagar = 0;

    switch (codigoDoProduto) {
      case 1:
        valorAPagar = quantidadeComprada * 5.00;
        break;
      case 2:
        valorAPagar = quantidadeComprada * 3.50;
        break;
      case 3:
        valorAPagar = quantidadeComprada * 4.80;
        break;
      case 4:
        valorAPagar = quantidadeComprada * 8.90;
        break;
      case 5:
        valorAPagar = quantidadeComprada * 7.32;
        break;
    }

    System.out.printf("%nValor a pagar: %.2f MZN%n", valorAPagar);

    entrada.close();
  }
}
