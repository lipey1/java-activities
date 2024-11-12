import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        System.out.println("Insira uma palavra");
        Scanner scan = new Scanner(System.in);
        char firstChar;
        char lastChar;
        String palavra = scan.nextLine();
        boolean ehPalindromo = true;

        for (int i = 0; i < palavra.length(); i++) {
            firstChar = palavra.charAt(i);
            lastChar = palavra.charAt(palavra.length() - 1 - i);

            if (firstChar != lastChar) {
                ehPalindromo = false;
                break;
            }
        }
        if (ehPalindromo) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
}