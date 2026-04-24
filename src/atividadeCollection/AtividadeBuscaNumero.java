package atividadeCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AtividadeBuscaNumero {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número que você deseja encontrar: ");
		int num = scanner.nextInt();

		boolean encontrado = false;

		for (Integer n : numeros) {
			if (n.equals(num)) {
				System.out.println("O número " + num + " foi encontrado!");
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("O número " + num + " não foi encontrado!");
		}

		scanner.close();
	}
}
