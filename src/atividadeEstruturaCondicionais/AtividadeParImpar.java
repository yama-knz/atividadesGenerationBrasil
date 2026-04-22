package atividadeEstruturaCondicionais;

import java.util.Scanner;

public class AtividadeParImpar {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar
		 * e se o número é positivo ou negativo.
		 */
		
		int num;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		num = scanner.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.printf("O número %d é par e positivo!", num);
			}
			else {
				System.out.printf("O número %d é ímpar e positivo!", num);
			}
		}
		else {
			if (num % 2 == 0) {
				System.out.printf("O número %d é par e negativo!", num);
			}
			else {
				System.out.printf("O número %d é ímpar e negativo!", num);
			}
		}
		
		scanner.close();
		
	}

}
