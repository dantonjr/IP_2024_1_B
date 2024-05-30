import java.util.Scanner;

public class Uni6Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valores[] = new int[10];
    for (int i = 0; i < valores.length; i++) {
      System.out.printf("Informe número %d..: ", i + 1);
      valores[i] = teclado.nextInt();
    }

    System.out.println("*** MOSTRANDO VALORES ***");

    for (int i = valores.length - 1; i >= 0; i--) {
      System.out.printf("Posicao %d - valor %d%n", i + 1, valores[i]);
    }
  }
}
