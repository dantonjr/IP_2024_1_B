import java.util.Scanner;

public class Multiplica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor A.: ");
        int a = teclado.nextInt();

        System.out.print("Informe o valor B.: ");
        int b = teclado.nextInt();
        int multiplicacao = a * b;
        
        System.out.printf("Resposta: %d x %d = %d", a, b, multiplicacao);

    }
}
