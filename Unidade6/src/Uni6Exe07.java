import java.util.Scanner;

public class Uni6Exe07 {

  private Uni6Exe07() {
    Scanner teclado = new Scanner(System.in);
    int valores[] = new int[leNumero(teclado, 1, 10)];
    leVetor(teclado, valores);
    mostraVetor(valores);
    ordenaVetor(valores);
    mostraVetor(valores);
  }

  private void ordenaVetor(int vetor[]) {
    int aux;
    for (int i = 0; i < vetor.length; ++i) {
      for (int j = i; j < vetor.length; ++j) {
        if (vetor[i] > vetor[j]) {
          aux = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = aux;
        }
      }
    }
  }

  private void mostraVetor(int vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.printf("%d, ", vetor[i]);
    }
    System.out.println("");
  }

  private void leVetor(Scanner tec, int vetor[]) {
    int i = 0;
    while (i < vetor.length) {
      System.out.printf("Posição %d%n", i);
      int valor = leNumero(tec, -100, 100);
      if (!procuraValorVetor(valor, vetor)) {
        vetor[i] = valor;
        i++;
      } else {
        System.out.printf("Valor %d já existe no vetor%n", valor);
      }
    }
  }

  private boolean procuraValorVetor(int valor, int vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      if (valor == vetor[i]) {
        return true;
      }
    }
    return false;
  }

  private int leNumero(Scanner tec, int minimo, int maximo) {
    int numero = 0;
    do {
      System.out.printf("Informe um número >= %d e <= %d..: ", minimo, maximo);
      numero = tec.nextInt();
    } while (numero < minimo || numero > maximo);
    return numero;
  }

  public static void main(String[] args) {
    new Uni6Exe07();
  }
}
