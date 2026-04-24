package atividadeVetores;

import java.util.Scanner;

public class AtividadeAnalisaVetor {

	public static void main(String[] args) {

		int[] vetor = new int[10];
		int soma = 0, qtdPares = 0, qtdIndiceImpar = 0;
		double media;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros:");

		for (int i = 0; i < vetor.length; i++) {
			System.out.print((i + 1) + "° número: ");
			vetor[i] = scanner.nextInt();

			soma += vetor[i];

			if (vetor[i] % 2 == 0)
				qtdPares++;
			if (i % 2 == 1)
				qtdIndiceImpar++;
		}

		int[] pares = new int[qtdPares];
		int[] indiceImpar = new int[qtdIndiceImpar];

		int p = 0, imp = 0;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] % 2 == 0) {
				pares[p++] = vetor[i];
			}

			if (i % 2 == 1) {
				indiceImpar[imp++] = vetor[i];
			}
		}

		media = (double) soma / vetor.length;

		System.out.println("\nElementos nos índices ímpares:");
		for (int num : indiceImpar) {
			System.out.print(num + " ");
		}

		System.out.println("\nElementos pares:");
		for (int num : pares) {
			System.out.print(num + " ");
		}

		System.out.println("\nSoma: " + soma);
		System.out.printf("Média: %.2f", media);
		scanner.close();
		
	}
}
