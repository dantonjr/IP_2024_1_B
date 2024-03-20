public class OperacaoMatematica {
    public static void main(String[] args) {
        int numero = 10;
        int quadrado = numero * numero;
        int cubo = numero * numero * numero;
        System.out.println(quadrado);
        System.out.println(cubo);
        int resposta = (int)Math.pow(numero, 6);
        double raiz = Math.sqrt(9);
        System.out.println(resposta);
        System.out.println(raiz);
        System.out.println(Math.PI);
    }
}
