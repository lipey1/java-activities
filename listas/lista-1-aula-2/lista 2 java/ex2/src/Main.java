import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Celular pocket = new Celular("Samgung", "Pocket", 1500);
        Scanner sc = new Scanner(System.in);
        int status = 0;
        while (true) {
            System.out.println("O que deseja fazer ?\n1 - Ligar o celular\n2 - Desligar o celular\nR: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    status = pocket.ligar(status);
                    break;
                case 2:
                    status = pocket.desligar(status);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }

    }
}
