public class ExemploMetodo {

    private ExemploMetodo() {
        mostraMenu("Principal");
        System.out.println(soma(2, 6));
        System.out.println(soma(10, 30));
        int a = 100;
        int r = soma(soma(a, 20), soma(90, 30));
        System.out.println(r);
    }

    private int soma(int n1, int n2) {
        return n1 + n2;
    }

    private void mostraMenu(String titulo) {
        System.out.println("***** MENU " + titulo + " *****");
        System.out.println("opção 1 - blablabla");
        System.out.println("opção 2 - tralala");
        System.out.println("opção 3 - blebleble");
        System.out.println("Outra opção aleatória");
        System.out.println("Informe a opção...: ");
    }

    public static void main(String[] args) {
        new ExemploMetodo();
    }
}
