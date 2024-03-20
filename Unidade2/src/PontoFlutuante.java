import java.text.DecimalFormat;

public class PontoFlutuante {
    public static void main(String[] args) {
       double valor = 10.123456789;

        String formato1 = String.format("O valor é: %f", valor);
        String formato2 = String.format("O valor é: %15f", valor);
        String formato3 = String.format("O valor é: %.3f", valor);
        String formato4 = String.format("O valor é: %015.3f", valor);
        System.out.println(formato1);
        System.out.println(formato2);
        System.out.println(formato3);
        System.out.println(formato4);

        DecimalFormat padrao = new DecimalFormat("###,##0.000");
        double valor2 = .2;
        System.out.println(padrao.format(valor2));
    }
}
