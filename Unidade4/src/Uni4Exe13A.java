import java.util.Scanner;

public class Uni4Exe13A {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // 1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei
    // Entrada
    System.out.println("Informa as 3 cartas: ");
    int carta1 = teclado.nextInt();
    int carta2 = teclado.nextInt();
    int carta3 = teclado.nextInt();

    // Processo
    int qtdCartasBoas = 0;

    if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
      qtdCartasBoas++; // qtdCartasBoas = qtdCartasBoas + 1; // qtdCartasBoas += 1;
    }
    if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
      qtdCartasBoas++;
    }
    if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
      qtdCartasBoas++;
    }

    // Saida
    if (qtdCartasBoas == 1) { // APENAS UMA das três cartas for AS, 2 ou 3
      System.out.println("TRUCO");
    } else {
      if (qtdCartasBoas == 2) { // APENAS DUAS das três cartas for AS, 2 ou 3
        System.out.println("SEIS");
      } else {
        if (qtdCartasBoas == 3) { // AS TRÊS cartas forem AS, 2 ou 3
          System.out.println("NOVE");
        }
      }
    }

    teclado.close();
  }
}
