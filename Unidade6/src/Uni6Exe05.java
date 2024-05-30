import java.util.Scanner;

public class Uni6Exe05 {

    private Uni6Exe05() {
        Scanner teclado = new Scanner(System.in, "UTF-8");
        String perguntas[] = { "Gosta de música sertaneja?",
                "Gosta de futebol?",
                "Gosta de seriados?",
                "Gosta de redes sociais?",
                "Gosta da Oktoberfest?" };
        String respostasRapaz[] = lerRespostas(teclado, perguntas, "rapaz");
        String respostasGarota[] = lerRespostas(teclado, perguntas, "garota");
        int afinidade = calculaAfinidade(respostasRapaz, respostasGarota);
        System.out.println(determinaStatus(afinidade));
    }

    private String determinaStatus(int afinidade) {
        System.out.println(afinidade);
        if (afinidade == 15) {
            return "Casem!!!!";
        } else if (afinidade >= 10) {
            return "Vocês têm muita coisa em comum!!";
        } else if (afinidade >= 5) {
            return "Talvez não dê certo :(";
        } else if (afinidade >= 0) {
            return "Vale um encontro!!";
        } else if (afinidade >= -9) {
            return "Melhor não perder tempo!";
        } else {
            return "Vocês se odeiam!";
        }
    }

    private String[] lerRespostas(Scanner tec, String perguntas[], String id) {
        String respostas[] = new String[perguntas.length];
        System.out.printf("*** RESPOSTAS DO(A) - %s ***%n", id);
        for (int i = 0; i < perguntas.length; i++) {
            System.out.printf("%s..: ", perguntas[i]);
            respostas[i] = tec.next().toUpperCase();
        }
        return respostas;
    }

    private int calculaAfinidade(String respostasRapaz[], String respostasGarota[]) {
        int afinidade = 0;
        for (int i = 0; i < respostasRapaz.length; i++) {
            if (respostasRapaz[i].equals(respostasGarota[i])) {
                afinidade += 3;
            } else if ((respostasRapaz[i].equals("IND")
                    && (respostasGarota[i].equals("SIM") || respostasGarota[i].equals("NÃO")))
                    || (respostasGarota[i].equals("IND")
                            && (respostasRapaz[i].equals("SIM") || respostasRapaz[i].equals("NÃO")))) {
                afinidade += 1;
            } else if ((respostasRapaz[i].equals("SIM") && respostasGarota[i].equals("NÃO"))
                    || (respostasGarota[i].equals("SIM") && respostasRapaz[i].equals("NÃO"))) {
                afinidade -= 2;
            }
        }
        return afinidade;
    }

    public static void main(String[] args) {
        new Uni6Exe05();
    }
}
