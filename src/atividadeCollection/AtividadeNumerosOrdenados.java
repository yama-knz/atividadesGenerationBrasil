package atividadeCollection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AtividadeNumerosOrdenados {

    public static void main(String[] args) {

        Set<Integer> numeros = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "° número: ");
            int num = scanner.nextInt();
            numeros.add(num);
            
        }

        System.out.println("\nListar dados do Set:");

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}