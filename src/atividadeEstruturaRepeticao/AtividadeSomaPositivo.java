package atividadeEstruturaRepeticao;

import java.util.Scanner;

public class AtividadeSomaPositivo {

	public static void main(String[] args) {
		
		int num, soma = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			num = scanner.nextInt();
			
			if (num > 0) {
				soma += num;
			}
			
		} while (num != 0);
		
		System.out.print("\nA soma dos números positivos é: " + soma);
		scanner.close();
	}
	
}
