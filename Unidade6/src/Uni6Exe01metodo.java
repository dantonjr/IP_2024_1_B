import java.util.Scanner;

public class Uni6Exe01metodo {
  private Uni6Exe01metodo() {
    Scanner teclado = new Scanner(System.in);
    int valores[] = new int[10];
    leVetor(teclado, valores);
    imprimeVetor(valores);
    teclado.close();
  }

  private void leVetor(Scanner tec, int vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.printf("Informe posição %d..: ", i + 1);
      vetor[i] = tec.nextInt();
    }
  }

  private void imprimeVetor(int vetor[]) {
    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.printf("Posição %d - Valor %d%n", i + 1, vetor[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe01metodo();
  }
}
