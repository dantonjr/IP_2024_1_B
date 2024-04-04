import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número...: ");
        double numero = teclado.nextDouble();
        if (numero - (int) numero > 0) {
            System.out.println("tem casas decimais");
        } else {
            System.out.println("não tem casas decimais");
        }

        if (numero - Math.floor(numero) != 0.0) {
            System.out.println("tem casas decimais");
        } else {
            System.out.println("não tem casas decimais");
        }
    }
}
