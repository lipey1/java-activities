import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira um numero: ");
        Scanner scan = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        System.out.println("soma: " + (num1 + num2) + "\nsubtração: " + (num1 - num2) + "\nmultiplicação: " + (num1 * num2) + "\ndivisão: " + (num1 / num2));

    }
}