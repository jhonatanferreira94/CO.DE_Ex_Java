package EstruturasDecisao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        /*Criar uma variavel*/
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o salario: "); //console.log()
        //double salario = Double.parseDouble(leitor.nextLine());
        double salario = leitor.nextDouble(); //nextDouble aceita apenas numeros com ,

        if (salario<1000){
            double salarioReajustado = salario*1.1;
//            System.out.print("Salario menor que mil "+salarioReajustado);
            System.out.printf("O seu novo salario é : %.2f", salarioReajustado);
        } else{
            System.out.print("Salario sem reajuste!");
        }
    }
}
