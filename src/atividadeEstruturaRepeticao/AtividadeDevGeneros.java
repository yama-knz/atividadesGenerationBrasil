package atividadeEstruturaRepeticao;

import java.util.Scanner;

public class AtividadeDevGeneros {

    public static void main(String[] args) {
        
        int idade, cod_gen, devs;
        
        int totalPessoas = 0;
        int somaIdade = 0;

        int backend = 0;
        int frontendMulheres = 0;
        int mobileHomens40 = 0;
        int fullstackNB30 = 0;

        String resp = "s";
        
        Scanner scanner = new Scanner(System.in);
        
        while (!resp.equalsIgnoreCase("n")) {
            
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            System.out.println();
            
            System.out.println("""
==============================
Identidade de Gênero:
1 – Mulher Cis
2 – Homem Cis
3 – Não Binário
4 – Mulher Trans
5 – Homem Trans
6 – Outros
==============================
""");

            System.out.print("Identidade de Gênero: ");
            cod_gen = scanner.nextInt();
            System.out.println();
            
            System.out.println("""
==============================
Pessoa Desenvolvedora:
1 – Backend
2 – Frontend
3 – Mobile
4 – FullStack
==============================
""");

            System.out.print("Pessoa Desenvolvedora: ");
            devs = scanner.nextInt();
            System.out.println();
            
            totalPessoas++;
            somaIdade += idade;

            if (devs == 1) {
                backend++;
            }

            if ((cod_gen == 1 || cod_gen == 4) && devs == 2) {
                frontendMulheres++;
            }

            if ((cod_gen == 2 || cod_gen == 5) && devs == 3 && idade > 40) {
                mobileHomens40++;
            }

            if (cod_gen == 3 && devs == 4 && idade < 30) {
                fullstackNB30++;
            }

            System.out.print("Deseja continuar (S/N): ");
            resp = scanner.next();
            System.out.println();
        }

        System.out.println("Total de pessoas desenvolvedoras Backend:" + backend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + frontendMulheres);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobileHomens40);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + fullstackNB30);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);

        if (totalPessoas > 0) {
            double media = (double) somaIdade / totalPessoas;
            System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f%n", media);
        } else {
            System.out.println("Nenhuma pessoa respondeu à pesquisa.");
        }

        scanner.close();
    }
}
