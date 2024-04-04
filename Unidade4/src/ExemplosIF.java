import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ExemplosIF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número..: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par..");
            if (numero > 1000) {
                System.out.println("Maior que 1000");
            }
        }
        System.out.println("Cheguei ao fim");
    }
}
