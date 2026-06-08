package desafio02;

import java.util.Locale;
import java.util.Scanner;

public class ControleFinanceiro {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        double despesa;

        System.out.print("Digite uma despesa (0 para finalizar): ");
        despesa = scanner.nextDouble();

        while (despesa != 0) {

            total = total + despesa;

            System.out.print("Digite uma despesa (0 para finalizar): ");
            despesa = scanner.nextDouble();
        }

        System.out.println("Total acumulado: " + total);

        scanner.close();
    }
}
