import java.util.Scanner;

public class Uni6Exe02 {

    private Uni6Exe02() {
        Scanner teclado = new Scanner(System.in);
        double valores[] = new double[12];
        leVetor(teclado, valores);
        mostraAcimaDaMedia(valores, calculaMedia(valores));
    }

    private void leVetor(Scanner tec, double vetor[]) {
        System.out.println("*** LEITURA DO VETOR ***");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Valor %d..: ", i + 1);
            vetor[i] = tec.nextDouble();
        }
    }

    private void mostraAcimaDaMedia(double vetor[], double media) {
        System.out.printf("*** VALORES ACIMA DA MÉDIA: %.2f ***%n", media);
        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.printf("Posição %d - Valor %.2f%n", i + 1, vetor[i]);
            }
        }
    }

    private double calculaMedia(double vetor []) {
        double acumula = 0;
        for(int i = 0; i < vetor.length; i++) {
            acumula += vetor[i];
        }
        return acumula / vetor.length;
    }

    public static void main(String[] args) {
        new Uni6Exe02();
    }
}
