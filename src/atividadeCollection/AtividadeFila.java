package atividadeCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void exibirMenu() {
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("     1 - Adicionar Cliente na Fila");
		System.out.println("     2 - Listar todos os Clientes");
		System.out.println("     3 - Retirar Cliente da Fila");
		System.out.println("     4 - Exibir próximo Cliente");
		System.out.println("     5 - Verificar se cliente está na fila");
		System.out.println("     0 - Sair");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.print("Digite uma opção: ");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();

		int opcao;

		do {
			exibirMenu();
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				System.out.print("Digite o nome: ");
				String nome = scanner.nextLine();
				fila.add(nome);

				System.out.println("\nFila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}

				System.out.println("Cliente adicionado!");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Lista de Clientes na Fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Cliente chamado: " + fila.poll());
					System.out.println("Fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;

			case 4:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Próximo cliente: " + fila.peek());
				}
				break;

			case 5:
				if (!fila.isEmpty()) {
					System.out.print("Nome do Cliente que deseja buscar: ");
					String busca = scanner.nextLine();

					if (fila.contains(busca)) {
						System.out.println("O cliente " + busca + " está na fila.");
					} else {
						System.out.println("O cliente " + busca + " NÃO está na fila.");
					}
				} else {
					System.out.println("A fila está vazia!");
				}
				break;

			case 0:
				System.out.println("Programa finalizado!");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		scanner.close();
	}
}
