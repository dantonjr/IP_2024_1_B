public class ExemploIfEOU {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        if (!(a == 0 ^ b == 0)) {
            System.out.println("Entrei");
        }

        // if ((a == 0 && b == 1) || a >0) {
        //     System.out.println("entrei");
        // }
    }
}
