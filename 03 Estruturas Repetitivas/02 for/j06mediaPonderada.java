
// media ponderada

// Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
// teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
// que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar
// que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida
// pela soma dos pesos. 

// Exemplo:
// Quantos casos voce vai digitar? 3
// Digite tres numeros:
// 6.5
// 4.3
// 6.2
// MEDIA = 5.7 


import java.util.Scanner;

public class j06mediaPonderada {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int N;
    double a, b, c, media;


    System.out.print("Quantos casos voce vai digitar? ");
    N = entrada.nextInt();

    for ( int i = 0; i < N; i++) {

      System.out.println("Digite tres numeros: ");
      a = entrada.nextDouble();
      b = entrada.nextDouble();
      c = entrada.nextDouble();

      media = (a * 2 + b * 3 + c * 5) / 10 ;

      System.out.printf("MEDIA = %.1f\n", media);

    }


    entrada.close();
  }
}
