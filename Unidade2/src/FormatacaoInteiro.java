public class FormatacaoInteiro {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 10;
        int numero3 = 100;
        int numero4 = 1000;
        System.out.printf("Número: %d%n", numero1);
        System.out.printf("Numero: %10d%n", numero1);
        System.out.printf("Número: %d%n", numero2);
        System.out.printf("Numero: %10d%n", numero2);
        System.out.printf("Número: %d%n", numero3);
        System.out.printf("Numero: %10d%n", numero3);
        System.out.printf("Número: %d%n", numero4);
        System.out.printf("Numero: %10d%n", numero4);

        System.out.printf("Número: %d%n", numero1);
        System.out.printf("Numero: %010d%n", numero1);

    }
}
