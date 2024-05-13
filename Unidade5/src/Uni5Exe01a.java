import java.util.Scanner;

public class Uni5Exe01a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Informe o número %d..: ", i);
            int numero = teclado.nextInt();
            if (numero % 2 == 0) {
                System.out.println("O número é par");
            } else {
                System.out.println("O número é ímpar");
            }
            // System.out.printf("O número %d é %s%n", numero, numero % 2 ==0 ? "Par" : "Ímpar");
        }
    }
}
