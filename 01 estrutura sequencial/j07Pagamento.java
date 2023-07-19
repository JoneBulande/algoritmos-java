
// Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
// quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
// uma mensagem explicativa. 

import java.util.Scanner;

public class j07Pagamento {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String nome;
    double valorPorHora, pagamento;
    int horasTrabalhadas;

    System.out.print("Digite o nome do funcionário: ");
    nome = input.nextLine();
    
    System.out.print("Digite o valor recebido por horas: ");
    valorPorHora = input.nextDouble();
    
    System.out.print("Digite digite as horas trabalhadas: ");
    horasTrabalhadas = input.nextInt();

    pagamento = valorPorHora * horasTrabalhadas;

    System.out.printf("%nO Pagamento para o %s deve ser %.2f%n", nome, pagamento);


    input.close();
  }
}
