
// Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
// com quatro casas decimais):
// a) a área do quadrado que tem lado A
// b) a área do triângulo retângulo que base A e altura B
// c) a área do trapézio que tem bases A e B, e altura C 

import java.util.Scanner;

public class j09Medidas {
  public static void main(String[] args) {
    
    // 
    Scanner input = new Scanner(System.in);
    double a, b, c;
    double areaQuadrado, areaTriangulo, areaTrapezio;
    
    
    // 
    System.out.print("Digite a medida de A: ");
    a = input.nextDouble();

    System.out.print("Digite a medida de B: ");
    b = input.nextDouble();

    System.out.print("Digite a medida de C: ");
    c = input.nextDouble();

    
    // 
    areaQuadrado = Math.pow(a, 2);

    areaTriangulo = a * b / 2;
    
    areaTrapezio = (a+b) * c / 2;


    // 
    System.out.printf("%nAREA DO QUADRADO = %.4f", areaQuadrado);
    System.out.printf("%nAREA DO TRIANGULO = %.4f", areaTriangulo);
    System.out.printf("%nAREA DO TRAPEZIO = %.4f%n", areaTrapezio);

    input.close();
  }
}
