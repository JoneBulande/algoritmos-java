
// Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
// de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
// conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.

import java.util.Scanner;

public class j02Baskara {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    double a, b, c, delta, x1, x2;

    System.out.print("Coeficente a: ");
    a = entrada.nextDouble();

    System.out.print("Coeficente b: ");
    b = entrada.nextDouble();

    System.out.print("Coeficente c: ");
    c = entrada.nextDouble();

    delta = Math.pow(b,2) - 4 * a * c;

    if(a == 0 || delta < 0) {
      System.out.println("\nEsta equacao nao possui raizes reais");
    } else {

      x1 = (-b + Math.sqrt(delta)) / (2 * a);
      x2 = (-b - Math.sqrt(delta)) / (2 * a);
      
      System.out.printf("%nX1 = %.4f", x1);
      System.out.printf("%nX2 = %.4f%n", x2);
    }
    

    entrada.close();

  }
}
