// combustivel

// Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
// Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
// 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a
// 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
// código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem
// como as quantidades de cada combustível.

// Exemplo:
// Informe um codigo (1, 2, 3) ou 4 para parar: 8
// Informe um codigo (1, 2, 3) ou 4 para parar: 1
// Informe um codigo (1, 2, 3) ou 4 para parar: 7
// Informe um codigo (1, 2, 3) ou 4 para parar: 2
// Informe um codigo (1, 2, 3) ou 4 para parar: 2
// Informe um codigo (1, 2, 3) ou 4 para parar: 4
// MUITO OBRIGADO
// Alcool: 1
// Gasolina: 2
// Diesel: 0 

import java.util.Scanner;

public class j06combustivel {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int code, Alcool, Gasolina, Diesel;

    Alcool = 0;
    Gasolina = 0;
    Diesel = 0;

    System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
    code = entrada.nextInt();

    while (code != 4) {

      switch (code) {

        case 1:
          Alcool++;
          break;
        case 2:
          Gasolina++;
          break;
        case 3:
          Diesel++;
          break;
      }

      System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
      code = entrada.nextInt();

    }

    System.out.println("\nOBRIGADO!");
    System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n", Alcool, Gasolina, Diesel);

    entrada.close();
  }
}
