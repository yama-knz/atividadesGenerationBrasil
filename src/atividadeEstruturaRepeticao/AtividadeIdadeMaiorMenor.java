package atividadeEstruturaRepeticao;

import java.util.Scanner;

public class AtividadeIdadeMaiorMenor {

public static void main(String[] args) {
        
        int idade = 0, menores = 0, maiores = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();

            if (idade == -1) {
                break;
            }

            if (idade < 21) {
                menores++;
            } else if (idade > 50) {
                maiores++;
            }
        }

        System.out.println();
        System.out.print("Total de pessoas menores de 21 anos: " + menores);
        System.out.println("\nTotal de pessoas maiores de 50 anos: " + maiores);

        scanner.close();
    }
}
