
// Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
// números. 

import java.util.Scanner;

public class j04Soma {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    double x, y, soma;
    
    System.out.print("Digite o valor de X: ");
    x = input.nextDouble();
    
    System.out.print("Digite o valor de Y: ");
    y = input.nextDouble();

    soma = x + y;

    System.out.println("SOMA = " + soma);

    input.close();
  }
}
