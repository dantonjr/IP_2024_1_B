import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nome = teclado.nextLine();
        System.out.print("Informe um número inteiro...: ");
        int numero1 = teclado.nextInt();
        System.out.print("Informe um numero real.....: ");
        float valorReal = teclado.nextFloat();
        System.out.println("Olá " + nome);
        System.out.println("O valor inteiro é: " + numero1);
        System.out.println("O valor real é: " + valorReal);
    }
}
