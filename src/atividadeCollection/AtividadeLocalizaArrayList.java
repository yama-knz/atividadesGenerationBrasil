package atividadeCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeLocalizaArrayList {

	public static void main(String[] args) {

		int num;
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);

		System.out.print("Digite o número que você deseja encontrar: ");
		num = scanner.nextInt();

		if (lista.contains(num)) {
			System.out.println("\nO número " + num + " está na posição: " + lista.indexOf(num));
		} else {
			System.out.println("\nO número " + num + " não foi encontrado!");
		}

		scanner.close();
	}
}
