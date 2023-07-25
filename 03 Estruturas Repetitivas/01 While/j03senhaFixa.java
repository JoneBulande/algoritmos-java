// SENHA FIXA

// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
// senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
// for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
// encerrado. Considere que a senha correta é o valor 2002.

// Exemplo:
// Digite a senha: 2312
// Senha Invalida! Tente novamente: 2010
// Senha Invalida! Tente novamente: 1022
// Senha Invalida! Tente novamente: 2002
// Acesso permitido! 


import java.util.Scanner;

public class j03senhaFixa {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    int senha;


    System.out.print("Digite a senha: ");
    senha = entrada.nextInt();

    while (senha != 2002) {
      
      System.out.print("Senha invalida! Tente novamente: ");
      senha = entrada.nextInt();

    }

    System.out.println("Acesso Permitido!");

    entrada.close();

  }
}
