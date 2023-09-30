package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha;

        do {
            System.out.println("Digite sua senha: ");
            senha = leitor.nextLine();
            if (!senha.equals("123")){
                System.out.println("Digite sua senha novamente!");
            }
        }while (!senha.equals("123"));
        System.out.println("Senha correta!");
    }
}
