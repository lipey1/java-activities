import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("O que deseja fazer ?\n1 - Mandar o cachorro latir\n2 - Mandar o cachorro correr\n3 - Sair\nR: ");
        Cachorro dog = new Cachorro("Rato", "Chihuahua", 41);
        Scanner sc = new Scanner(System.in);
        int statusLatindo = 0;
        int statusCorrendo = 0;
        while (true) {
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    statusLatindo = dog.latir(statusLatindo);
                    break;
                case 2:
                    statusCorrendo = dog.correr(statusCorrendo);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Insira uma opção válida!");
            }
        }
    }
}
