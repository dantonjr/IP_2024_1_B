import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letra = teclado.nextLine().charAt(0);
        letra = Character.toLowerCase(letra);

        //char letra = teclado.nextLine().toLowerCase().charAt(0);
        // String palavra = teclado.nextLine();
        // char letra = palavra.charAt(0);
        if (letra == 'a' || letra == 'e' ||
                letra == 'i' || letra == 'o' ||
                 letra == 'u') {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }
    }
}
