package atividadesJava;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);

		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Salário Bruto: ");
		salarioBruto = scanner.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		adicionalNoturno = scanner.nextFloat();
		
		System.out.println("Horas Extras: ");
		horasExtras = scanner.nextFloat();
		
		System.out.println("Descontos:");
		descontos = scanner.nextFloat();
		
		salarioLiquido = salarioBruto + (adicionalNoturno + horasExtras * 5) - descontos;
		System.out.printf("Salário Líquido: %.2f%n", salarioLiquido);
		
	}

}
