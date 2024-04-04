import java.util.Scanner;

public class Uni4Exe13B {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // 1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei
    // Entrada
    System.out.println("Informa as 3 cartas: ");
    int carta1 = teclado.nextInt();
    int carta2 = teclado.nextInt();
    int carta3 = teclado.nextInt();

    // Processo
    // AS TRÊS cartas forem AS, 2 ou 3
    boolean nove = carta1 == 1 && carta2 == 1 && carta3 == 1 || 
                   carta1 == 2 && carta2 == 2 && carta3 == 2 || 
                   carta1 == 3 && carta2 == 3 && carta3 == 3;

    // APENAS DUAS das três cartas for AS, 2 ou 3
    boolean seis = carta1 == 1 && carta2 == 1 || carta1 == 1 && carta3 == 1 || carta2 == 1 && carta3 == 1 || 
                   carta1 == 2 && carta2 == 2 || carta1 == 2 && carta3 == 2 || carta2 == 2 && carta3 == 2 || 
                   carta1 == 3 && carta2 == 3 || carta1 == 3 && carta3 == 3 || carta2 == 3 && carta3 == 3;

    // APENAS UMA das três cartas for AS, 2 ou 3
    boolean truco = carta1 == 1 || carta2 == 1 || carta3 == 1 || 
                    carta1 == 2 || carta2 == 2 || carta3 == 2 || 
                    carta1 == 3 || carta2 == 3 || carta3 == 3;

    // Saida
    if (nove) {
      System.out.println("NOVE");
    } else {
      if (seis) {
        System.out.println("SEIS");
      } else {
        if (truco) {
          System.out.println("TRUCO");
        }
      }
    }

    teclado.close();
  }
}
