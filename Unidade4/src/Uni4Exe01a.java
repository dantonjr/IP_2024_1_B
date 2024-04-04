import java.util.Scanner;

public class Uni4Exe01a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com as horas trabalhadas no mês..: ");
        int horasMes = teclado.nextInt();
        System.out.print("Entre com o valor pago por hora..: ");
        float horasValor = teclado.nextFloat();
        float salarioTotal = horasMes * horasValor;
        if (horasMes > 160) {
            float salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
            //salarioTotal += salarioExtra;
        }
        System.out.println("O salário total é: " + salarioTotal);
    }
}
