import java.util.Scanner;

public class Uni4Exe20a {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota prova 1.....: ");
        float notaProva1 = teclado.nextFloat();
        System.out.print("Nota prova 2.....: ");
        float notaProva2 = teclado.nextFloat();
        System.out.print("Nota prova 3.....: ");
        float notaProva3 = teclado.nextFloat();
        System.out.print("Nota exercícios.: ");
        float notaExercicios = teclado.nextFloat();
        float media = (notaProva1 + (notaProva2 * 2) + (notaProva3 * 3) + notaExercicios) / 7;
        char conceito = ' ';
        if (media >= 9) {
            conceito = 'A';
        } else if (media >= 7.5) {
            conceito = 'B';
        } else if (media >= 6) {
            conceito = 'C';
        } else if (media >= 4.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }
        String situacao = "";
        if (media >= 6) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        System.out.printf("A média é %.2f com conceito %c e situação %s.", media, conceito, situacao);
    }
}
