
// Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
// formato horas:minutos:segundos.

import java.util.Scanner;

public class j10Duracao {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int segundosEndrada, segundosSaida, minutos, horas, resto;

    
    // 
    System.out.print("Digite a duracao em segundos: ");
    segundosEndrada = input.nextInt();


    // 
    horas = segundosEndrada / 3600;

    resto = segundosEndrada % 3600;

    minutos = resto / 60;

    segundosSaida = resto % 60;

    
    // 
    System.out.println(horas+ ":" + minutos+ ":" +segundosSaida);  


    input.close();
  }
}