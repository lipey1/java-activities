import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carroca = new Carro(1512, "Marrom", "Cavalo", "Peludo", 1000, 1200, 0, 30);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i == 0;) {
            System.out.println("O que tu deseja fazer meu nobre:");
            System.out.println("1 - Acelerar\n2 - Frear\n3 - Parar");
        int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    carroca.velocidade = Carro.Acelerar(carroca.velocidade, carroca.velocidadeMax);
                    System.out.println("Velocidade atual: " + carroca.velocidade);
                    System.out.println("Rapidão eim, fica ligero mas nem tanto");
                    break;
                case 2:
                    carroca.velocidade = Carro.Frear(carroca.velocidade);
                    System.out.println("Velocidade atual: " + carroca.velocidade);
                    break;
                case 3:
                    carroca.velocidade = Carro.Parar(carroca.velocidade);
                    System.out.println("Velocidade atual: " + carroca.velocidade);
                    break;
                default:
                    System.out.println("invalido bobao");
            }
        }
    }
}