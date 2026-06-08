import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControlePresenca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite a quantidade de participantes: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        System.out.print("Digite a duração total do evento (em minutos): ");
        long duracaoEvento = Long.parseLong(sc.nextLine());

        for (int i = 1; i <= quantidade; i++) {

            System.out.println("\nParticipante " + i);

            System.out.print("Nome do Participante: ");
            String nome = sc.nextLine();

            System.out.print("Horário de entrada (HH:mm): ");
            LocalTime entrada = LocalTime.parse(sc.nextLine(), formatter);

            System.out.print("Tempo de saida (em minutos): ");
            LocalTime saida = LocalTime.parse(sc.nextLine(), formatter);

            long tempoAssistido = Duration.between(entrada, saida).toMinutes();

            if (tempoAssistido >= duracaoEvento) {

                System.out.println("E-mail de agradecimento enviado para " + nome);

            } else {

                System.out.println("Nenhum e-mail enviado para " + nome);
            }
        }
        sc.close();
    }
}
