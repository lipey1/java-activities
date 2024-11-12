// Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra");
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        int count = 0;
        char vogal;
        for (int i = 0; i < palavra.length(); i++) {
            vogal = palavra.charAt(i);
            if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u'  ) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("A palavra " + palavra + " não tem vogais!");
            System.exit(0);
        }
        System.out.println("vogais: " + count);

    }
}
