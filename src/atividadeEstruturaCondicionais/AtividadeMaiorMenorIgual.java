package atividadeEstruturaCondicionais;

import java.util.Scanner;

public class AtividadeMaiorMenorIgual {

	public static void main(String[] args) {
		// Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.
		
		int a, b, c;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o número de A: ");
		a = scanner.nextInt();
		
		System.out.println("Digite o número de B: ");
		b = scanner.nextInt();
		
		System.out.println("Digite o número de C: ");
		c = scanner.nextInt();
		
		int soma = a + b;

        if (soma > c) {
            System.out.println("A soma de A + B é Maior que C");
        }
        else if (soma < c) {
            System.out.println("A soma de A + B é Menor que C");
        }
        else {
            System.out.println("A soma de A + B é Igual a C");
        }

        scanner.close();
		
	}

}
