import java.util.Scanner;

public class Uni6Exe09 {

  private Uni6Exe09() {
    int qtdClientes = 30; // 30 clientes [30][ ]
    int qtdRespostas = 3; // 3 respostas [ ][3] -> sexo, nota e idade
    int dados[][] = new int[qtdClientes][qtdRespostas];

    dadosLer(dados, qtdClientes, qtdRespostas);
    dadosInforme(dados, qtdClientes, qtdRespostas);
  }

  private void dadosLer(int dados[][], int qtdClientes, int qtdRespostas) {
    Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < qtdClientes; i++) {
      System.out.println(" _ Informe os dados para o cliente [" + (i + 1) + "]");
      System.out.println("sexo (1=feminino 2=masculino): ");
      dados[i][0] = teclado.nextInt();
      System.out.println("nota para o cinema (zero até dez): ");
      dados[i][1] = teclado.nextInt();
      System.out.println("idade: ");
      dados[i][2] = teclado.nextInt();
    }

    teclado.close();
  }

  private void dadosInforme(int dados[][], int clientesQtd, int qtdRespostas) {
    int clientesSomaNota = 0;
    int homemSomaNota = 0;
    int homemQtd = 0;
    int mulherJovemId = -1;
    int mulherJovemIdade = 999;

    for (int cliente = 0; cliente < clientesQtd; cliente++) {
      clientesSomaNota += dados[cliente][1];
      if (dados[cliente][0] == 2) { // homem
        homemSomaNota += dados[cliente][1];
        homemQtd++;
      }
      if (dados[cliente][0] == 1) { // mulher
        if (dados[cliente][2] < mulherJovemIdade) {
          mulherJovemIdade = dados[cliente][2];
          mulherJovemId = cliente;
        }
      }
    }
    double notaMedia = (double) clientesSomaNota / clientesQtd;
    System.out.println("Nota média recebida pelo cinema: " + notaMedia);
    double notaMediaHomem = (double) homemSomaNota / homemQtd;
    System.out.println("Nota média atribuída pelos homens: " + notaMediaHomem);
    System.out.println("Nota atribuída pela mulher mais jovem: " + dados[mulherJovemId][1]);

    int qtdMulherMedia = 0;
    for (int cliente = 0; cliente < clientesQtd; cliente++) {
      if (dados[cliente][2] > 50) { // mulher, idade > 50
        if (dados[cliente][1] > notaMedia) {
          qtdMulherMedia++;
        }
      }
    }
    System.out.println("Quantidade de mulheres com mais de 50 anos deram nota superior a média: " + qtdMulherMedia);

  }

  public static void main(String[] args) {
    new Uni6Exe09();
  }

}

/*
 * _ Dados para teste
 * 
 * int dados[][] = { { 1, 8, 30 }, { 2, 9, 25 }, { 1, 7, 23 }, { 2, 8, 51 }, {
 * 1, 4, 51 } };
 */