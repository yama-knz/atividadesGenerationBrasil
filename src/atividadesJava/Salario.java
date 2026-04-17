package atividadesJava;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		float valorSalario = scanner.nextFloat();
		
		System.out.print("Digite o abono: ");
		float abono = scanner.nextFloat();
		
		float novoSalario = valorSalario + abono;
		System.out.printf("Novo Salário: %.2f%n", novoSalario);

		scanner.close();
	}
}