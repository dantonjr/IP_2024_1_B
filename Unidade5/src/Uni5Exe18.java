import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdPessoasCanal4 = 0;
        int qtdPessoasCanal5 = 0;
        int qtdPessoasCanal9 = 0;
        int qtdPessoasCanal12 = 0;
        int qtdPessoasTotal = 0;
        int qtdPessoasAssistindo = 0;
        System.out.print("Informe canal...: ");
        int nroCanal = teclado.nextInt();
        while (nroCanal != 0) {
            System.out.print("informe nro pessoas assistindo..: ");
            qtdPessoasAssistindo = teclado.nextInt();
            qtdPessoasTotal += qtdPessoasAssistindo;
            switch (nroCanal) {
                case 4:
                    qtdPessoasCanal4 += qtdPessoasAssistindo;
                    break;
                case 5:
                    qtdPessoasCanal5 += qtdPessoasAssistindo;
                    break;
                case 9:
                    qtdPessoasCanal9 += qtdPessoasAssistindo;
                    break;
                case 12:
                    qtdPessoasCanal12 += qtdPessoasAssistindo;
                    break;
                default:
                    System.out.println("Canal inválido!!!!");
                    qtdPessoasTotal -= qtdPessoasAssistindo;
                    break;
            }
            System.out.print("Informe canal...: ");
            nroCanal = teclado.nextInt();
        }
        if (qtdPessoasTotal > 0) {
            System.out.println("***** Audiência *****");
            System.out.printf("Canal 4 %.2f%%%n", (qtdPessoasCanal4 / (double) qtdPessoasTotal * 100));
            System.out.printf("Canal 5 %.2f%%%n", (qtdPessoasCanal5 / (double) qtdPessoasTotal * 100));
            System.out.printf("Canal 9 %.2f%%%n", (qtdPessoasCanal9 / (double) qtdPessoasTotal * 100));
            System.out.printf("Canal 12 %.2f%%%n", (qtdPessoasCanal12 / (double) qtdPessoasTotal * 100));
        }
        teclado.close();
    }
}
