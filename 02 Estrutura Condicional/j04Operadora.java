
// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
// telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
// ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.

import java.util.Scanner;

public class j04Operadora {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int minutos;
    double valorAPagar;

    System.out.print("Digite a quantidade de minutos: ");
    minutos = entrada.nextInt();

    if(minutos > 100) {

      valorAPagar = ((minutos - 100) * 2) + 50;
      
    } else {

      valorAPagar = 50.00;

    }

    System.out.printf("%nValor a pagar %.2f MZN %n", valorAPagar);

    entrada.close();

  }
}
