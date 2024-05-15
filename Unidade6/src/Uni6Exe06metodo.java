import java.util.Scanner;

public class Uni6Exe06metodo {
  private Uni6Exe06metodo() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe oo tamanho do vetor (N): ");
    final int vetorTamanho = teclado.nextInt();
    double vetor[] = new double[vetorTamanho];

    vetorLer(teclado, vetor); // Ler vetor - popular

    // Opção A
    boolean achou;
    achou = vetorPesquisa(teclado, vetor); // Pesquisar vetor
    if (achou) {
      System.out.println("Encontrou..");
    }

    // Opção B
    if (vetorPesquisa(teclado, vetor)) {
      System.out.println("Encontrou..");
    }

    teclado.close();
  }

  // Ler vetor - popular
  private void vetorLer(Scanner teclado, double vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Valor: ");
      vetor[i] = teclado.nextInt();
    }
  }

  // Pesquisa vetor
  private boolean vetorPesquisa(Scanner teclado, double vetor[]) {
    System.out.println("Informe valor a ser pesquisado: ");
    double valorPesquisado = teclado.nextInt();
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == valorPesquisado) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    new Uni6Exe06metodo();
  }
}
