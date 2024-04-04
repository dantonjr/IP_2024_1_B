import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha sua opção:");
        System.out
                .println("\t1 - Ciência da Computação\n\t2 - Licenciatura da Computação\n\t3 - Sistemas de Informação");
        System.out.print("Escolha o curso: ");
        int curso = teclado.nextInt();
        switch (curso) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Curso inválido...");
                break;
        }
    }

}
