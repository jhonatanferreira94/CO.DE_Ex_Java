package EstruturaRepeticao;

public class Exercicio1 {
    public static void main(String[] args) {
        String[] listaProfessores = {"Alexia", "Odirlei", "Jessica", "Thiago", "Jhonatan"};
        for (int contador = 0; contador < listaProfessores.length; contador++) {
            if (contador == 0) {
                System.out.println("O numero do indice do(a) professora(a)"+listaProfessores[contador]+" é zero.");
            } else if (contador %2==0) {
                System.out.println("O numero do indice do(a) professora(a)"+listaProfessores[contador]+" é par.");
            } else {
                System.out.println("O numero do indice do(a) professora(a)"+listaProfessores[contador]+" é impar.");
            }

        }

    }
}
