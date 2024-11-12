import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira um numero: ");
        Scanner scan = new Scanner(System.in);
        float n1 = scan.nextFloat();
        if(n1 % 2 == 0) System.out.println("O numero " + n1 + " é par");
        else System.out.println("O número " + n1 + " é ímpar");
    }
}