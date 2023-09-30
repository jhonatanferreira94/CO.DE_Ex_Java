package EstruturaRepeticao;

public class Exercicio3 {
    public static void main(String[] args) throws InterruptedException {
        String[] listaCarros = {"McQueen", "Mate", "Doc Hudson", "Sally Carrera"};
        for (String cadaCarro:listaCarros) {
            System.out.println(cadaCarro);
            Thread.sleep(1000 );
        }
    }
}
