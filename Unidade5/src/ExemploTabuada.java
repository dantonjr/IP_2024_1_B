import java.util.Scanner;

public class ExemploTabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o número...: ");
        int numero = teclado.nextInt();
        System.out.println("***** USANDO FOR *****");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, (numero * i));
        }
        System.out.println("***** USANDO WHILE *****");
        int i = 0;
        while (i <= 10) {
            System.out.printf("%d x %d = %d%n", numero, i, (numero * i++));
        }
        System.out.println("***** USANDO DO WHILE *****");
        i = 0;
        do {
            System.out.printf("%d x %d = %d%n", numero, i, (numero * i++));
        } while (i <= 10);
    }

}
