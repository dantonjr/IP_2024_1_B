import java.util.Scanner;

public class Uni5Exe09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o total de alunos..: ");
        int qtdAlunos = teclado.nextInt();
        String nomes18Anos = "";
        int contaALunosAcima20Anos =0;
        for (int nroAluno = 0; nroAluno < qtdAlunos; nroAluno++) {
            System.out.print("Informe nome do aluno...: ");
            String nome = teclado.next();
            System.out.print("Informe a idade do aluno..: ");
            int idade = teclado.nextInt();

            if (idade == 18) {
                nomes18Anos += nome + " ";
            } else if (idade > 20) {
                contaALunosAcima20Anos++;
            }
        }
        System.out.println("Alunos com 18 anos: " + nomes18Anos);
        System.out.println("Total de alunos com + 20 anos: " + contaALunosAcima20Anos);
    }
}
