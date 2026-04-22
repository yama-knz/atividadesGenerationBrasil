package atividadeEstruturaCondicionais;

import java.util.Scanner;

public class AtividadeCargos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome, cargo = "";
        int cod;
        float salario, reajuste = 0, novoSalario;
        
        System.out.println("""
        	    ====== TABELA DE CARGOS ======
        	    Código | Cargo           | Reajuste
        	    ---------------------------------------
        	    1      | Gerente         | 10%
        	    2      | Vendedor        |  7%
        	    3      | Supervisor      |  9%
        	    4      | Motorista       |  6%
        	    5      | Estoquista      |  5%
        	    6      | Técnico de TI   |  8%
        	    """);
        
        System.out.print("Nome do colaborador: ");
        nome = scanner.nextLine();

        System.out.print("Cargo: ");
        cod = scanner.nextInt();

        System.out.print("Salário: R$ ");
        salario = scanner.nextFloat();
        
        switch (cod) {
            case 1:
                cargo = "Gerente";
                reajuste = 0.10f;
                
                System.out.println("\nNome do colaborador: " + nome);
                System.out.println("Cargo: " + cargo);
                
                break;
            case 2:
                cargo = "Vendedor";
                reajuste = 0.07f;
                
                System.out.println("\nNome do colaborador: " + nome);
                System.out.println("Cargo: " + cargo);
                
                break;
            case 3:
                cargo = "Supervisor";
                reajuste = 0.09f;
                
                System.out.println("\nNome do colaborador: " + nome);
                System.out.println("Cargo: " + cargo);
                
                break;
            case 4:
                cargo = "Motorista";
                reajuste = 0.06f;
                
                System.out.println("\nNome do colaborador: " + nome);
                System.out.println("Cargo: " + cargo);
                
                break;
            case 5:
                cargo = "Estoquista";
                reajuste = 0.05f;
                
                System.out.println("\nNome do colaborador: " + nome);
                System.out.println("Cargo: " + cargo);
                
                break;
            case 6:
                cargo = "Técnico de TI";
                reajuste = 0.08f;
                
                System.out.println("\nNome do colaborador: " + nome);
                System.out.println("Cargo: " + cargo);
                
                break;
            default:
                System.out.println("Código inválido!");
        }
        novoSalario = salario + (reajuste * salario);
        System.out.printf("Salário reajustado: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}
