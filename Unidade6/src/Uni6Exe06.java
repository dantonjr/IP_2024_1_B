import java.util.Scanner;

public class Uni6Exe06 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe oo tamanho do vetor (N): ");
    final int vetorTamanho = teclado.nextInt();
    double vetor[] = new double[vetorTamanho];

    // Ler vetor - popular
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Valor: ");
      vetor[i] = teclado.nextInt();
    }

    // Pesquisa vetor
    System.out.println("Informe valor a ser pesquisado: ");
    double valorPesquisado = teclado.nextInt();
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == valorPesquisado) {
        System.out.println("Encontrou..");
      }
    }

    teclado.close();
  }
}
