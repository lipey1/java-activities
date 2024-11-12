// Desenvolva um jogo de adivinhação onde o computador escolhe um número aleatório entre 1 e 100, e o usuário deve adivinhar qual é o número. O programa deve fornecer dicas ao usuário se o palpite for muito alto ou muito baixo e contar o número de tentativas até o acerto.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random = new Random();

        System.out.println("Digite um numero: ");
        int attempts = 10;
        int correctNumber = random.nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int userAttempt = scan.nextInt();
            attempts -= 1;
            if (attempts == 0 && userAttempt != correctNumber){
                System.out.println("Acabaram as tentativas, o numero correto era: " + correctNumber);
                System.exit(0);
            }
            if(userAttempt > correctNumber){
                System.out.println("Errou! Muito alto (tentativas restantes: " + (attempts) + ")");
            } else if (userAttempt < correctNumber){
                System.out.println("Errou! Muito baixo (tentativas restantes: " + (attempts) + ")");
            } else if (userAttempt == correctNumber){
                System.out.println("Parabéns! Você acertou ! (Tentativas restantes: " + (attempts) + ")");
                System.exit(0);
            }

        }
    }
}
