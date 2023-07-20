
// Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para
// isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
// informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com
// duas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve
// deduzir a fórmula de Celsius para Fahrenheit): c = 5/9 (f - 32)

import java.util.Scanner;

public class j08Temperatura {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    char escala;
    double temperaturaInicial, temperaturaFinal;

    System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
    escala = entrada.next().charAt(0);

    if (escala == 'f' || escala == 'F') {

      System.out.print("Digite a temperatura em Fahrenheit: ");
      temperaturaInicial = entrada.nextDouble();

      temperaturaFinal = 5.0 / 9.0 * (temperaturaInicial - 32.0);

      System.out.printf("%nTemperatura equivalente em Celsius: %.2f%n", temperaturaFinal);

    } else if (escala == 'c' || escala == 'C') {

      System.out.print("Digite a temperatura em Celsius: ");
      temperaturaInicial = entrada.nextDouble();

      temperaturaFinal = temperaturaInicial * 9.0 / 5.0 + 32.0;

      System.out.printf("%nTemperatura equivalente em Fahrenheit: %.2f%n", temperaturaFinal);

    } else {

      System.out.println("Escala invalida!");

    }

    entrada.close();

  }
}
