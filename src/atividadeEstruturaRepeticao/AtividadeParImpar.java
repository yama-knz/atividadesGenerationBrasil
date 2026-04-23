package atividadeEstruturaRepeticao;

import java.util.Scanner;

public class AtividadeParImpar {

	public static void main(String[] args) {
		
		int num, pares = 0, impares = 0;
		Scanner scanner = new Scanner (System.in);
		
		for (int i = 1; i < 11; i++) {
			System.out.print("Digite o "+ i +"º número: ");
			num = scanner.nextInt();
			if (num % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		
		System.out.println();
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);
		scanner.close();
		
	}

}
