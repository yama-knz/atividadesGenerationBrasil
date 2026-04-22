package atividadeEstruturaCondicionais;

import java.util.Scanner;

public class AtividadeLanchonete {

	public static void main(String[] args) {
		
		/*
		 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6)
		 * e a quantidade comprada deste item (número inteiro). 
		 */
		
        Scanner scanner = new Scanner(System.in);

        int cod, qtd;
        double preco = 0;
        String produto = "";
        
        System.out.println("""
        	    ====== TABELA DE PRODUTOS ======
        	    Código | Produto           | Preço
        	    -------------------------------------
        	    1      | Cachorro Quente   | R$ 10.00
        	    2      | X-Salada          | R$ 15.00
        	    3      | X-Bacon           | R$ 18.00
        	    4      | Bauru             | R$ 12.00
        	    5      | Refrigerante      | R$  8.00
        	    6      | Suco de laranja   | R$ 13.00
        	    """);
        
        System.out.print("Código do Produto: ");
        cod = scanner.nextInt();

        System.out.print("Quantidade: ");
        qtd = scanner.nextInt();

        switch (cod) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.00;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.00;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.00;
                break;
            case 6:
                produto = "Suco de laranja";
                preco = 13.00;
                break;
            default:
                System.out.println("Código inválido!");
                scanner.close();
                return;
        }

        double total = qtd * preco;

        System.out.println("Produto: " + produto);
        System.out.printf("Total: R$ %.2f%n", total);

        scanner.close();
    }
}
