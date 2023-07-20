
// No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
// Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
// foi a maior. 

import java.util.Scanner;

public class j07Dardo {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    double x, y, z;

    System.out.println("Digite as tres distancias: ");
    x = entrada.nextDouble();
    y = entrada.nextDouble();
    z = entrada.nextDouble();

    if (x > y && x > z) {

      System.out.printf("%nMAIOR DISTANCIA = %.2f%n", x);

    } else if (y > z) {

      System.out.printf("%nMAIOR DISTANCIA = %.2f%n", y);

    } else {

      System.out.printf("%nMAIOR DISTANCIA = %.2f%n", z);

    }

    entrada.close();
  }
}
