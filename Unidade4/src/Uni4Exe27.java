import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Hora de chegada....: ");
        int horaChegada = teclado.nextInt();
        System.out.print("Minuto de chegada..: ");
        int minutoChegada = teclado.nextInt();
        System.out.print("Hora de saída......: ");
        int horaSaida = teclado.nextInt();
        System.out.print("Minuto de saída....: ");
        int minutoSaida = teclado.nextInt();
        if (horaChegada >= 0 && horaChegada <= 24 &&
                minutoChegada >= 0 && minutoChegada <= 60 &&
                horaSaida >= 0 && horaSaida <= 24 &&
                minutoSaida >= 0 && minutoSaida <= 60 &&
                horaSaida >= horaChegada) {
            int minutoChegadaTotal = (horaChegada * 60) + minutoChegada;
            int minutoSaidaTotal = (horaSaida * 60) + minutoSaida;
            int minutoTotal = minutoSaidaTotal - minutoChegadaTotal;
            int qtdHoras = minutoTotal / 60;
            int qtdMinutos = minutoTotal % 60;
            System.out.printf("Ficou estacionado %dh%dm", qtdHoras, qtdMinutos);
            if (qtdMinutos >= 30) {
                qtdHoras++;
            }
            System.out.printf("Vai pagar por %d horas", qtdHoras);
            double valorCobrado = 0;
            switch (qtdHoras) {
                case 0:
                case 1:
                    valorCobrado = 5;
                    break;
                case 2:
                    valorCobrado = 10;
                    break;
                case 3:
                    valorCobrado = 17.5;
                    break;
                case 4:
                    valorCobrado = 25;
                    break;
                default:
                    valorCobrado = 25 + (10 * (qtdHoras - 4));
                    break;
            }
            System.out.printf("Valor cobrado %.2f", valorCobrado);
        } else {
            System.out.println("Hora/Minuto ERRADO");
        }
    }
}
