import java.util.Arrays;

public class VetorRandomico {
    public static void main(String[] args) {
        int numeros[] = new int[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 1001);
        }
        int maiorNumero = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        System.out.printf("Maior número %d%n", maiorNumero);
        for (int numero : numeros) {
            System.out.printf("%d,  ", numero);
        }
        System.out.println("******* Usando Lambda");
        Arrays.stream(numeros).forEach(i -> System.out.print(i + " "));
    }
}
