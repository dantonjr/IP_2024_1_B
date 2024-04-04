import java.util.Scanner;

public class Uni4Exe20 {
    // Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios,
    // descreva um algoritmo que calcule a média de aproveitamento e o conceito do
    // aluno, usando a fórmula:

    // \normalsize&space;media=(notaProva1+notaProva22+notaProva33+notaExercicios)/7

    // A atribuição dos conceitos obedece à tabela abaixo:

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
        } else if (media >= 7.5 && media < 9) {
            conceito = 'B';
        } else if (media >= 6 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4.0 && media < 6) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }
        String situacao = "";
        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        System.out.printf("A média é %.2f com conceito %c e situação %s.", media, conceito, situacao);
    }
}
