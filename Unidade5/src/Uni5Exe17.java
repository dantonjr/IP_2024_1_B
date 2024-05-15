import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maiorAltura = Integer.MIN_VALUE;
        int incricaoMaiorAltura = 0;
        int menorAltura = Integer.MAX_VALUE;
        int incricaoMenorAltura = 0;
        int acumulaAltura = 0;
        int contaAtletas = 0;
        System.out.print("Informe número de inscrição...: ");
        int nroInscricao = teclado.nextInt();
        while (nroInscricao != 0) {
            System.out.print("Informe a altura.............: ");
            int alturaCm = teclado.nextInt();
            if (alturaCm > maiorAltura) {
                maiorAltura = alturaCm;
                incricaoMaiorAltura = nroInscricao;
            }
            if (alturaCm < menorAltura) {
                menorAltura = alturaCm;
                incricaoMenorAltura = nroInscricao;
            }
            acumulaAltura += alturaCm;
            contaAtletas++;
            System.out.print("Informe número de inscrição...: ");
            nroInscricao = teclado.nextInt();
        }
        if (contaAtletas > 0) {
            System.out.printf("> alt %d - insc %d%n", maiorAltura, incricaoMaiorAltura);
            System.out.printf("< alt %d - insc %d%n", menorAltura, incricaoMenorAltura);
            System.out.printf("tot atletas %d - med alt %d", contaAtletas, (acumulaAltura / contaAtletas));
        } else {
            System.out.println("Sem dados para informar!!");
        }
    }
}
