package atividadeCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class AtividadePilha {

	public static void exibirMenu() {
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("     1 - Adicionar Livro na Pilha");
		System.out.println("     2 - Listar todos os Livros");
		System.out.println("     3 - Retirar Livro da Fila");
		System.out.println("     4 - Procurar Livro na fila");
		System.out.println("     0 - Sair");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.print("Digite uma opção: ");
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		Deque<String> livraria = new ArrayDeque<>();
		int opcao;
		
		do {
			exibirMenu();
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1: 
			    System.out.print("Digite o nome: ");
			    String nome = scanner.nextLine();
			    livraria.push(nome);
			    
			    System.out.println("\nPilha:");
			    for (String livro : livraria) {
			        System.out.println(livro);
			    }
			    System.out.println("Livro adicionado!");
			    break;

			case 2:
			    if (livraria.isEmpty()) {
			        System.out.println("A pilha está vazia!");
			    } else {
			        System.out.println("Livros na pilha:");
			        for (String livro : livraria) {
			            System.out.println(livro);
			        }
			    }
			    break;

			case 3:
			    if (livraria.isEmpty()) {
			        System.out.println("A pilha está vazia!");
			    } else {
			        livraria.pop();
			        for (String livro : livraria) {
			            System.out.println(livro);
			        }
			        System.out.println("Um Livro foi retirado da pilha!");
			    }
			    break;
				
			case 4:
			    if (livraria.isEmpty()) {
			        System.out.print("A pilha está vazia!");
			    } else {
			        System.out.print("Nome do Livro que deseja buscar: ");
			        String livro = scanner.nextLine();

			        if (livraria.contains(livro)) {
			            System.out.println("\n"+ livro + " encontrado na pilha.\n");
			        } else {
			            System.out.print("\n"+ livro + " NÃO encontrado na pilha.\n");
			        }
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
