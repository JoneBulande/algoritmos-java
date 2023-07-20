
// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
// pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
// horas. 

// Exemplo 
// Hora inicial: 16
// Hora final: 2
// O JOGO DUROU 10 HORA(S) 

import java.util.Scanner;

public class j12TempoDeJogo {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int horaInicial, horaFinal, tempoDeJogo;

    System.out.print("Informe a hora inicial: ");
    horaInicial = entrada.nextInt();

    System.out.print("Informe a hroa final: ");
    horaFinal = entrada.nextInt();

    if (horaInicial >= horaFinal) {

      tempoDeJogo = (24 - horaInicial) + horaFinal;

    } else {

      tempoDeJogo = horaFinal - horaInicial;

    }

    System.out.println("\nO JOGO DUROU " + tempoDeJogo + " HORA(S)");

    entrada.close();
  }
}
