
// Problema "notas"
// Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de
// uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no
// ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
// mensagem "REPROVADO"

import java.util.Scanner;

public class  j01Notas {
  public static void main(String[] args) {
    
    // 
    Scanner entrada = new Scanner(System.in);
    double nota1, nota2, notaFinal;

    // 
    System.out.print("Digite a primeira nota: ");
    nota1 = entrada.nextDouble();

    System.out.print("Digite a segunda nota: ");
    nota2 = entrada.nextDouble();

    // 
    notaFinal = nota1 + nota2;

    // ls
    if(notaFinal > 60.00) {
      System.out.printf("%nNOTA FINAL = %.1f%n", notaFinal);
    } else {
      System.out.println("REPROVADO");
    }

    entrada.close();
  }
}