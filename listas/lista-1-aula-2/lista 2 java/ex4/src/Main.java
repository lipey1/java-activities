import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Insira o número da sua conta bancária: "));
        int nConta = sc.nextInt();
        ContaBancaria conta = new ContaBancaria(nConta, 0);

        float valorSaque;
        float valorDeposito;
        float saldo = 0;

        while (true) {
            System.out.println("O que deseja fazer ?\n1 - Depositar\n2 - Sacar\n3 - Sair\nR: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Qual seria o valor do depósito ?");
                    valorDeposito = sc.nextFloat();
                    saldo = conta.depositar(nConta, saldo, valorDeposito);
                    break;
                case 2:
                    System.out.println("Qual seria o valor do saque ?\nR$");
                    valorSaque = sc.nextFloat();
                    saldo = conta.sacar(nConta, valorSaque);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
