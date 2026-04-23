package atividadeEstruturaRepeticao;

import java.util.Scanner;

public class AtividadeMultiplosDeTres {

    public static void main(String[] args) {
        
        int num, soma = 0, numTotal = 0;
        double media;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            if (num != 0 && num % 3 == 0) {
                soma += num;
                numTotal++;
            }

        } while (num != 0);
        
        if (numTotal > 0) {
            media = (double) soma / numTotal;
            System.out.printf("\nMédia dos múltiplos de 3: %.1f%n", media);
        } else {
            System.out.println("\nNenhum múltiplo de 3 foi digitado.");
        }

        scanner.close();
    }
}
