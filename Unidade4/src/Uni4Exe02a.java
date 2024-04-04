import java.util.Scanner;

public class Uni4Exe02a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número > 0...: ");
        int numero = teclado.nextInt();
        if (numero <= 0) {
            System.out.println("Número inválido. Precisa ser > 0");
            System.out.println("Tente novamente...");
        } else {
            if (numero % 2 == 0) {
                System.out.println("Número é par");
            } else {
                System.out.println("Número é ímpar");
            }
        }
    }
}
