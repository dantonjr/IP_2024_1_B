import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni6Exe08 {

	private Uni6Exe08() {
		Scanner teclado = new Scanner(System.in);

		int tamVet;
		do {
			System.out.print("Tamanho Vetor: ");
			tamVet = teclado.nextInt();
		} while ((tamVet < 1) || (tamVet > 20));
		double vet[] = new double[tamVet];

		VetLer(vet, teclado);
		System.out.println("---");
		VetEscrever(vet);
		System.out.println("---");
		VetAcharIgual_OpcaoA(vet);
		System.out.println("---");
		VetAcharIgual_OpcaoB(vet);

		teclado.close();
	}

	private void VetLer(double vet[], Scanner teclado) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print("vet[" + i + "]: ");
			vet[i] = teclado.nextDouble();
		}
	}

	private void VetEscrever(double vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

	private void VetAcharIgual_OpcaoA(double vetor[]) {
		boolean achou[] = new boolean[vetor.length];
		for (int i = 0; i < achou.length; i++) {
			achou[i] = false;
		}
		System.out.println();
		System.out.println("VALOR   |  FREQÜÊNCIA  ");
		int contador;
		for (int i = 0; i < vetor.length; i++) {
			contador = 0;
			for (int j = 0; j < vetor.length; j++) {
				if (!achou[j]) {
					if (vetor[i] == vetor[j]) {
						achou[j] = true;
						contador++;
					}
				}
			}
			if (contador > 0) {
				System.out.println(vetor[i] + " | " + contador);
			}
		}
	}

	private void VetAcharIgual_OpcaoB(double vet[]) {
		DecimalFormat df_2 = new DecimalFormat("0.00");
		System.out.println("|  VALOR   |  FREQÜÊNCIA | ");

		int qtd;
		int eleLista = 0;
		boolean pesq;

		while (eleLista < vet.length) {
			qtd = 1;
			int pesAbaixo = 0;
			pesq = true;
			while (pesAbaixo < eleLista) {
				if (vet[pesAbaixo] == vet[eleLista]) {
					pesq = false;
				}
				pesAbaixo++;
			}
			if (pesq) {
				System.out.print("|  " + df_2.format(vet[eleLista]) + "    |         ");
				int indTeste = eleLista + 1;
				while (indTeste < vet.length) {
					if (vet[eleLista] == vet[indTeste]) {
						qtd++;
					}
					indTeste++;
				}
				System.out.println(qtd + "   |");
			}
			eleLista++;
		}
	}

	public static void main(String[] args) {
		new Uni6Exe08();
	}

}
