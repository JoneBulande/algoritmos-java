
// Leia os valores das coordenadas X e Y de um ponto no plano
// cartesiano. A seguir, determine qual o quadrante ao qual pertence o
// ponto (Q1, Q2, Q3 ou Q4). Se o ponto estiver na origem, escreva a
// mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
// “Eixo X” ou “Eixo Y”, conforme for a situação

import java.util.Scanner;

public class j13Coordenadas {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    double x, y;

    System.out.print("Informe o valor de X: ");
    x = entrada.nextDouble();

    System.out.print("Informe o valor de Y: ");
    y = entrada.nextDouble();

    if (x == 0 || y == 0) {

      if (x == 0 && x == 0) {
        System.out.println("Origem");
      } else if (x == 0 && y != 0) {

        System.out.println("Eixo Y");

      } else {

        System.out.println("Eixo X");

      }

    } else if (x > 0 && y > 0) {

      System.out.println("Q1");

    } else if (x < 0 && y > 0) {

      System.out.println("Q2");

    } else if (x < 0 && y < 0) {

      System.out.println("Q3");

    } else {

      System.out.println("Q4");

    }

    entrada.close();
  }
}
