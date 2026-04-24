package atividadeVetores;

import java.util.Scanner;

public class AtividadeLocalizaVetor {

	public static void main(String[] args) {
		boolean encontrado = false;
		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número que você deseja encontrar: ");
		int num = scanner.nextInt();


		for (int i = 0; i < vetorNumeros.length; i++) {
			if (num == vetorNumeros[i]) {
				System.out.println("\nO número " + num + " está na posição: " + i);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.printf("\nO número %d não foi encontrado!", num);
		}
		scanner.close();
		
	}
}
