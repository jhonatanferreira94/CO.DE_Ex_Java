package EstruturasDecisao;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: "); //console.log()
        int numero = leitor.nextInt();

        if (numero>0){
            System.out.print("Positivo");
        } else if (numero<0) {
            System.out.print("Negativo");
        } else {
            System.out.print("Neutro");
        }

    }
}
