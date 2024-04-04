import java.util.Scanner;

public class Uni4Exe03a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe número 1...: ");
        int n1 = teclado.nextInt();
        System.out.print("Informe número 2...: ");
        int n2 = teclado.nextInt();

        // Operador ternário
        String maior = n1 == n2 ? "iguais" : n1 > n2 ? "n1 maior" : "N2 maior";
        System.out.println(maior);

        // if (n1 != n2) {
        // if (n1 > n2) {
        // System.out.println("Maior valor é 1");
        // } else {
        // System.out.println("Maior valor é 2");
        // }
        // } else {
        // System.out.println("Os núemros ão iguais");
        // }

        if (n1 == n2) {
            System.out.println("Os números são iguais");
        } else if (n1 > n2) {
            System.out.println("Número 1 é maior: " + n1);
        } else {
            System.out.println("Número 2 é maior: " + n2);
        }
    }
}
