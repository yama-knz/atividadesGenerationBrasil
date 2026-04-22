package atividadeEstruturaCondicionais;

import java.util.Scanner;

public class AtividadeClassificaAnimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavra1, palavra2, palavra3;
        
        System.out.println("""
                === CLASSIFICAÇÃO DE ANIMAIS ===

                1ª palavra:
                - vertebrado
                - invertebrado

                2ª palavra:
                Se vertebrado:
                - ave
                - mamifero
                Se invertebrado:
                - inseto
                - anelideo

                3ª palavra:
                ave: carnivoro ou onivoro
                mamifero: onivoro ou herbivoro
                inseto: hematofago ou herbivoro
                anelideo: hematofago ou onivoro
                """);
        
        System.out.println("Digite a primeira palavra:");
        palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra:");
        palavra2 = scanner.nextLine();

        System.out.println("Digite a terceira palavra:");
        palavra3 = scanner.nextLine();

        // Bloco para vertebrados
        if (palavra1.equalsIgnoreCase("vertebrado")) {

            if (palavra2.equalsIgnoreCase("ave")) {

                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("Águia");
                }
                else if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Pomba");
                }

            }
            else if (palavra2.equalsIgnoreCase("mamifero")) {

                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Homem");
                }
                else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Vaca");
                }

            }

        // Bloco para invertebrados
        }
        else if (palavra1.equalsIgnoreCase("invertebrado")) {

            if (palavra2.equalsIgnoreCase("inseto")) {

                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Pulga");
                }
                else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Lagarta");
                }

            }
            else if (palavra2.equalsIgnoreCase("anelideo")) {

                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Sanguessuga");
                }
                else if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Minhoca");
                }

            }
        }

        scanner.close();
    }
}
