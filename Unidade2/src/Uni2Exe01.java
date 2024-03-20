import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        // Leia 2 valores inteiros e imprima sua soma.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o número 1...: ");
        int numero1 = teclado.nextInt();
        System.out.print("Informe o número 2..: ");
        int numero2 = teclado.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma é..: " + soma);

        System.out.println("A soma de " + numero1 + " com " + numero2 + " é..: " + soma);

        System.out.println(String.format("A soma de %d com %d é...: %d", numero1, numero2, soma));
        
        System.out.printf("A soma de %d com o valor %d tem como resultado %d%n", numero1, numero2, soma);
        System.out.println("Terminei!!!");

    }
}
