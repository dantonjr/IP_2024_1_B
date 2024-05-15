import java.util.Scanner;

public class Uni6Exe07 {
  private Uni6Exe07() {
    Scanner teclado = new Scanner(System.in);
    int vetTamanho;

    // Ler um valor válido
    do {
      System.out.print("Valor [1..20]: ");
      vetTamanho = teclado.nextInt();
    } while (vetTamanho < 1 || vetTamanho > 20);
    int vetor[] = new int[vetTamanho];

    vetorLer(vetor, teclado);
    vetorOrdenar(); // FIXME: falta fazer
    vetorImprimir(vetor);

    teclado.close();
  }

  // Leitura do vetor
  private void vetorLer(int vetor[], Scanner teclado) {
    System.out.println(" __ vetorLer");
    int valor;
    int vetorPos = 0;
    int i = 0;
    while (i < vetor.length) {
      System.out.print("Vet[" + i + "]: ");
      valor = teclado.nextInt();
      if (!vetorPesquisa(vetor, valor, vetorPos)) {
        vetor[i] = valor;
        vetorPos++;
        i++;
      }
    }
  }

  // Pesquisar se um valor já existe no vetor
  private boolean vetorPesquisa(int vetor[], int valor, int vetorPos) {
    System.out.println(" __ vetorPesquisa");
    for (int i = 0; i < vetorPos; i++) {
      if (valor == vetor[i]) {
        return true;
      }
    }
    return false;
  }

  // Ordenar (crescente) os valores de um vetor
  private void vetorOrdenar() {
    System.out.println(" __ vetorOrdenar");

  }

  // Imprimir os valores de um vetor
  private void vetorImprimir(int vet[]) {
    System.out.println(" __ vetorImprimir");
    for (int i = 0; i < vet.length; i++) {
      System.out.println("Vet[" + i + "]: " + vet[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe07();
  }
}
