import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre número da Tabuada..: ");
        int tabuada = teclado.nextInt();
        System.out.print("Entre com o início.......: ");
        int inicio = teclado.nextInt();
        System.out.print("Entre com o fim..........: ");
        int fim = teclado.nextInt();
        for (int i = inicio; i <= fim; i++) {
            System.out.printf("%d x %d = %d%n", 
                tabuada, i, (tabuada * i));
        }

        // for (int i = 0; i <= 10; i++) {
        // System.out.printf("%d x %d = %d%n",
        // tabuada, i, (tabuada * i));
        // }

        // for (int i = 10; i >= 0; i--) {
        // System.out.println(i);
        // }

        // int inicio = 0;
        // System.out.println(inicio++);
        // System.out.println(inicio++);
        // System.out.println(inicio++);
        // System.out.println(inicio++);
        // System.out.println(inicio++);
        // System.out.println(inicio);
    }
}
