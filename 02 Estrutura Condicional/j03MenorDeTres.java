
// Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
// números lidos. Em caso de empate, mostrar apenas uma vez.

import java.util.Scanner;

public class j03MenorDeTres {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int x, y, z;

    System.out.print("Informe o primeiro valor: ");
    x = entrada.nextInt();

    System.out.print("Informe o segundo valor: ");
    y = entrada.nextInt();

    System.out.print("Informe o terceiro valor: ");
    z = entrada.nextInt();

    if (x < y) {
      
      System.out.println("MENOR = " + x);
      
    } else if (y < z) {
      
      System.out.println("MENOR = " + y);
      
    } else {
      
      System.out.println("MENOR = " + z);

    }

    entrada.close();

  }

}
