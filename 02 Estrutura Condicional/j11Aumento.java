
// Uma empresa vai conceder um aumento percentual de
// salário aos seus funcionários dependendo de quanto
// cada pessoa ganha, conforme tabela abaixo. Fazer um
// programa para ler o salário de uma pessoa, daí mostrar
// qual o novo salário desta pessoa depois do aumento,
// quanto foi o aumento e qual foi a porcentagem de
// aumento. 

import java.util.Scanner;

public class j11Aumento {
  public static void main(String[] args) {

    //
    Scanner entrada = new Scanner(System.in);
    double salarioInicial, salarioFinal, aumento;
    int porcentagem;

    System.out.print("Digite o salario da pessoa: ");
    salarioInicial = entrada.nextDouble();

    if (salarioInicial < 1000.00) {

      porcentagem = 20;
      aumento = salarioInicial * porcentagem / 100;

    } else if (salarioInicial <= 3000.00) {

      porcentagem = 15;
      aumento = salarioInicial * porcentagem / 100;

    } else if (salarioInicial <= 8000.00) {

      porcentagem = 10;
      aumento = salarioInicial * porcentagem / 100;

    } else {

      porcentagem = 5;
      aumento = salarioInicial * porcentagem / 100;

    }

    salarioFinal = salarioInicial + aumento;

    System.out.printf("%nNovo Salario = %.2f", salarioFinal);
    System.out.printf("%nAumento = %.2f%n", aumento);
    System.out.println("Porcentagem = " + porcentagem + " %");

    entrada.close();
  }
}
