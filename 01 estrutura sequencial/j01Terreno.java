
// "terreno"
// Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
// casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
// o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
// duas casas decimais. 

import java.util.Scanner;

public class j01Terreno {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double larguraDoTerreno, comprimentoTerreno, metroQuadrado;
    double areaTerreno, precoTerreno;
    
    System.out.print("Digite a largura do terreno: ");
    larguraDoTerreno = entrada.nextDouble();

    System.out.print("Digite o comprimento do terreno: ");
    comprimentoTerreno = entrada.nextDouble();

    System.out.print("Digite o valor do metro quadrado: ");
    metroQuadrado = entrada.nextDouble();

    areaTerreno = larguraDoTerreno * comprimentoTerreno;
    precoTerreno = larguraDoTerreno * comprimentoTerreno * metroQuadrado;

    System.out.printf("Area do terreno = %.2f%n", areaTerreno);
    System.out.printf("Preco do terreno = %.2f%n", precoTerreno);

    entrada.close();
  }
}