package atividadeEstruturaCondicionais;

import java.util.Scanner;

public class AtividadeDoaSangue {

	public static void main(String[] args) {
		
		/*
		 * Para doar sangue é necessário ter entre 18 e 69 anos de idade.
		 * Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
		 * Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean).
		 * De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.
		 */
		
		int idade;
		boolean primeiraDoacao, apto;
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Nome do doador: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do doador: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Primeira doação de sangue? (S/N): ");
        String resp = scanner.nextLine();

        if (resp.equalsIgnoreCase("S")) {
            primeiraDoacao = true;
        }
        else {
            primeiraDoacao = false;
        }

        if (idade >= 18 && idade <= 59) {
            apto = true;
        }
        else if (idade >= 60 && idade <= 69 && !primeiraDoacao) {
            apto = true;
        }
        else {
            apto = false;
        }

        if (apto) {
            System.out.println(nome + " está apto para doar sangue!");
        } else {
            System.out.println(nome + " não está apto para doar sangue!");
        }

        scanner.close();
    }
}