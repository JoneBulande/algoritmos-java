
// Fazer um programa para ler a quantidade de glicose
// no sangue de uma pessoa e depois mostrar na tela a
// classificação desta glicose de acordo com a tabela de
// referência abaixo. 

// Classificação        Glicose 

// Normal               Até 100 mg/dl 
// Elevado          Maior que 100 até 140 mg/dl 
// Diabetes           Maior de 140 mg/dl

import java.util.Scanner;

public class j06Glicose {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    double glicose;
    String classificacao;

    System.out.print("Digite a media da glicose: ");
    glicose = entrada.nextDouble();

    if (glicose < 100) {

      classificacao = "normal";

    } else if (glicose <= 140) {

      classificacao = "elevado";

    } else {

      classificacao = "diabetes";

    }

    System.out.println("Classificacao: " + classificacao);

    entrada.close();
  }
}
