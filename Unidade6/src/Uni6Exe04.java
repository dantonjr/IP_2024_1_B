import java.util.Scanner;

public class Uni6Exe04 {

    private Uni6Exe04() {
        Scanner teclado = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        lerVetor(teclado, vetor1, "V1");
        lerVetor(teclado, vetor2, "V2");
        imprimeVetor(vetor1, "V1");
        imprimeVetor(vetor2, "V2");
        imprimeVetor(somaVetor(vetor1, vetor2), "Soma");
    }

    private void lerVetor(Scanner tec, int vetor[], String nomeVetor) {
        System.out.printf("*** LENDO VETOR: %s ***%n", nomeVetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d..: ", i + 1);
            vetor[i] = tec.nextInt();
        }
    }

    private int[] somaVetor(int v1[], int v2[]) {
        int soma[] = new int[v1.length];
        for (int i = 0; i < v1.length; i++) {
            soma[i] = v1[i] + v2[i];
        }
        return soma;
    }

    private void imprimeVetor(int vetor[], String nomeVetor) {
        System.out.printf("*** IMPRIMINDO VETOR: %s ***%n", nomeVetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d, ", vetor[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        new Uni6Exe04();
    }
}
