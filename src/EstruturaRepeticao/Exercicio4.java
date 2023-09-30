package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String usuario;
        String senha;

        System.out.println("Digite o seu usuário: ");
        usuario = leitor.nextLine();

        System.out.println("Digite o sua senha: ");
        senha = leitor.nextLine();

        if (usuario.equals("admin") && senha.equals("123")) {
            System.out.println("Login bem-sucedido!");
        } else if (!usuario.equals("admin") && senha.equals("123")) {
            System.out.println("Usuário incorreto");
        } else if (usuario.equals("admin") && !senha.equals("123")) {
            System.out.println("Senha incorreta");
        } else {
            System.out.println("Nome de usuário ou senha incorretor.");
        }
    }
}
