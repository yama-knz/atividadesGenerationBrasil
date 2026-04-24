package atividadeCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeOrdenaCor {

	public static void main(String[] args) {
		
		String cores;
		ArrayList<String> listaCores = new ArrayList<String>();
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite 5 cores: ");
		for (int i = 0; i < 5; i++) {
			cores = scanner.nextLine();
			listaCores.add(cores);
		}
		
		System.out.println("\nListar todas as cores:");
		for (int i = 0; i < listaCores.size(); i++) {
			System.out.println(listaCores.get(i));
		}
		
		ArrayList<String> coresOrdenado = new ArrayList<>(listaCores);
		Collections.sort(coresOrdenado);
		
		System.out.println("\nOrdenar as cores:");
		for (int i = 0; i < coresOrdenado.size(); i++) {
			System.out.println(coresOrdenado.get(i));
		}
		scanner.close();
		
	}

}
