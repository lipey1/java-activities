import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira seu nome: ");
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        int idade = scan.nextInt();
        System.out.println("Olá " + nome);
        System.out.println("Idade: "+ idade);
    }
}