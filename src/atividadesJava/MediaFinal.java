package atividadesJava;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		float n1, n2, n3, n4, media;
		
		System.out.println("Nota 1: ");
		n1 = scanner.nextFloat();
		
		System.out.println("Nota 2: ");
		n2 = scanner.nextFloat();
		
		System.out.println("Nota 3: ");
		n3 = scanner.nextFloat();
		
		System.out.println("Nota 4: ");
		n4 = scanner.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		System.out.printf("Média Final: %.1f%n", media);

	}

}
