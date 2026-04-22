package atividadeEstruturaCondicionais;

import java.util.Scanner;

public class AtividadeBanco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int cod;
		float saldo = 1000.0f, deposito, saque;
		
		System.out.print("Operação: ");
		cod = scanner.nextInt();
		
		switch (cod) {
		case 1: {
			System.out.print("Operação - Saldo");
			System.out.printf("\nSaldo: R$ %.2f", saldo);
			break;
		}
		case 2: {
			System.out.print("Operação - Saque");
			System.out.print("\nValor: R$ ");
			saque = scanner.nextFloat();
			
			if (saldo >= saque) {
				saldo -= saque;
				System.out.printf("Saque de R$ %.2f realizado com sucesso!", saque);
				System.out.printf("\nNovo Saldo: R$ %.2f", saldo);
			}
			else {
				System.out.print("Saldo Insuficiente!");
			}
			
			break;
		}
		case 3: {
			System.out.print("Operação - Depósito");
			System.out.print("\nValor: R$ ");
			deposito = scanner.nextFloat();
			
			saldo += deposito;
			System.out.printf("\nNovo Saldo: R$ %.2f", saldo);
			
			break;
		}
		default:
			System.out.print("Operação Inválida!");
		}
		
		scanner.close();
	}
}
