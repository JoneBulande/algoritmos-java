
// Problema "retangulo"
// Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
// da área, perímetro e diagonal deste retângulo, com quatro casas decimais. 

import java.util.Scanner;

public class j02Retangulo {

  public static void main(String[] args) {

    // declaração das variaveis
    double baseDoRetangulo, alturaDoRetangulo, areaDoRetangulo, perimetroDoRetangulo, diagonalDoRetangulo;
    
    
    // entrada de dados
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o valor da base do retângulo: ");
    baseDoRetangulo = entrada.nextDouble();

    System.out.print("Digite o valor da altura do retângulo: ");
    alturaDoRetangulo = entrada.nextDouble();


    // operações 
    // aritmétricas
    
    areaDoRetangulo = baseDoRetangulo * alturaDoRetangulo;
    
    perimetroDoRetangulo = baseDoRetangulo * 2 + alturaDoRetangulo * 2;
    
    diagonalDoRetangulo = Math.sqrt(Math.pow(baseDoRetangulo, 2) + Math.pow(alturaDoRetangulo, 2));


    // Saída de dados
    System.out.printf("%nAREA = %.4f%n", areaDoRetangulo);
    System.out.printf("PERIMETRO = %.4f%n", perimetroDoRetangulo);
    System.out.printf("DIAGONAL = %.4f%n", diagonalDoRetangulo);

    entrada.close();

  }
}
