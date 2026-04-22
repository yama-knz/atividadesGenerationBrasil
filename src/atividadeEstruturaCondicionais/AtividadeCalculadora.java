package atividadeEstruturaCondicionais;

import java.util.Scanner;

public class AtividadeCalculadora {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float n1, n2;
		int cod;
		
		System.out.println("""
			    ====== CALCULADORA ======
			    Código | Operação
			    -------------------------
			    1      | Soma
			    2      | Subtração
			    3      | Multiplicação
			    4      | Divisão
			    """);
		
		System.out.print("Digite o 1° número: ");
		n1 = scanner.nextInt();

		System.out.print("Digite o 2° número: ");
		n2 = scanner.nextInt();

		System.out.print("Operação: ");
		cod = scanner.nextInt();

		switch (cod) {
		case 1:
			System.out.print(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case 2:
			System.out.print(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case 3:
			System.out.print(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case 4:
			System.out.print(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		default:
			System.out.print("Operação Inválida!");
		}

	}

}
