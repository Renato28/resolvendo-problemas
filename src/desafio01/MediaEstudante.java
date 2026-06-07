package desafio01;

import java.util.Locale;
import java.util.Scanner;

public class MediaEstudante {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Entrada de dados
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Digite a média final do estudante: ");
        double media = scanner.nextDouble();

        // Estrutura condicional
        if (media < 5.0) {
            System.out.println("Você está reprovado.");
        } else if (media > 5.0 && media < 6.9) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Parabéns! Você foi aprovado.");
        }

        scanner.close();
    }
}
