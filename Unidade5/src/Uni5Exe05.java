import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe n (n > 2)..: ");
        int quantidade = teclado.nextInt();

        int numero = 8;
        int soma = 0;

        for (int contador = 2; contador <= quantidade; contador++) {
            System.out.printf("%d, %d, ", numero, numero + 2);
            soma = soma + numero + (numero + 2);
            numero *= 2; // numero = numero * 2;

        }
    }
}
