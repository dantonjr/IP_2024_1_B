import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numeros [] = new int[10];
        
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("entre número %d..: ", i);
            numeros[i] = teclado.nextInt();
        }

        for(int i = 0; i< numeros.length; i++) {
            System.out.println(numeros[i]);
        }



        // float salarios[] = new float[9];
        // salarios[0] = (float) 1000.0;
        // salarios[1] = 1450.0F;
        // salarios[2] = (float) 10954.53;
        // salarios[3] = 90.7F;
        // salarios[8] = 45000.90F;

        // for (int i = 0; i < salarios.length; i++) {
        //     System.out.println(salarios[i]);
        // }

    }
}
