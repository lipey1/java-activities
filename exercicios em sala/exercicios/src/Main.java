import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculo();
    }
    public static void calculo(){
        System.out.println("Insira o seu nome");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome ");
        String nome = scanner.nextLine();

        System.out.println("Ola " + nome);
    }
}