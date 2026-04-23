package atividadeEstruturaRepeticao;

import java.util.Scanner;

public class AtividadeMultiplos {

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		n1 = scanner.nextInt();
		System.out.print("Digite o último número do intervalo: ");
		n2 = scanner.nextInt();
		
		if (n1 < n2) {
			
			for (int i = n1; i <= n2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
			
		}
		else {
			System.out.println("Intervalo inválido!");
		}
		scanner.close();
		
	}

}
