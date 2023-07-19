
// Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
// combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
// médio do carro, com três casas decimais. 

import java.util.Scanner;

public class j08Consumo {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


    // 
    int distanciaPercorida;
    double combustivelGasto, consumoMedio;
    // 
    System.out.print("Digite a distancia percorrida: ");
    distanciaPercorida = input.nextInt();

    System.out.print("Combustivel gasto: ");
    combustivelGasto = input.nextDouble();
    
    // 
    consumoMedio = distanciaPercorida / combustivelGasto;

    // 
    System.out.printf("%nConsumo médio = %.3f%n", consumoMedio);

    input.close();
    
  }
}
