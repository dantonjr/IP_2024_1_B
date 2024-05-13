import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("informe nome 1 (fim termina)..: ");
		String nome = teclado.next();
		int contador = 1;
		while (!nome.equalsIgnoreCase("fim")) {
			contador++;
			System.out.println("boa noite " + nome);
			System.out.print("informe nome " + contador + " (fim termina)..: ");
			nome = teclado.next();
		}
		System.out.println("FIM");

		// int contador = 1;
		// while(contador < 5) {
		// System.out.println(contador);
		// contador+=3; }
		// System.out.println("FIM");
	}
}
