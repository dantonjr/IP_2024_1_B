public class ExemploDoWhile {
	public static void main(String[] args) {
		int contador = 10;
		do {
			System.out.println(contador++);
		} while (contador <= 5);
		System.out.println("FIM DO WHILE");

		contador = 10;
		while(contador <=5) {
			System.out.println(contador++);
		}
		System.out.println("FIM WHILE");
	}
}
