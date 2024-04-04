import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe peso....: ");
        float peso = teclado.nextFloat();
        System.out.print("Informe altura..: ");
        float altura = teclado.nextFloat();
        double imc = peso / Math.pow(altura, 2);
        String classificacao = "";
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 25) {
            classificacao = "Saudável";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }
        System.out.printf("IMC = %.2f - %s", imc, classificacao);
    }
}
