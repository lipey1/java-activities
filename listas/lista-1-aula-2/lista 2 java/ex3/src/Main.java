import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine();
        System.out.println("\nInsira sua idade: ");
        int idade = sc.nextInt();
        System.out.println("\nInsira sua altura em centimetros: (ex: 183)");
        int altura = sc.nextInt();
        Pessoa pessoa = new Pessoa(nome, idade, altura);

        while (true) {
            System.out.println("O que deseja fazer ?\n1 - Iniciar apresentação\n2 - Sair");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    pessoa.apresentacao(nome, idade, altura);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida!\n");
            }
        }

    }
}
