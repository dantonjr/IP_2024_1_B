public class ExemploForContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println("Escrevendo i: " + i);
            if (i < 10) {
                continue;
            }
            System.out.println("Escrevendo algo");
            System.out.println("escrevendo mais");
        }
    }
}
