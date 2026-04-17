package atividadesJava;

import java.util.Scanner;

public class diferencasValores {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		float n1, n2, n3, n4, diferencas;
		
		System.out.println("numero1: ");
		n1 = scanner.nextFloat();
		
		System.out.println("numero2: ");
		n2 = scanner.nextFloat();
		
		System.out.println("numero3: ");
		n3 = scanner.nextFloat();
		
		System.out.println("numero4: ");
		n4 = scanner.nextFloat();
		
		diferencas = (n1 * n2) - (n3 * n4);
		System.out.printf("Diferenças: %.1f%n", diferencas);
	}

}
