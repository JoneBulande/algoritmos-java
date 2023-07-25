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
