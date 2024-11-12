import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        System.out.println("Versão recursiva: " + recursiveVersion(num));
        if (num == 0)
            num = 1;
        else {
            for (int i = num - 1; i > 1; i--) {
                num *= i;
            }
        }
        System.out.println("\nVersão recursiva: " + num);
    }

    public static int recursiveVersion(int numeroUser) {
        if (numeroUser == 0) {
            return 1;
        } else {
            return numeroUser * recursiveVersion(numeroUser - 1);
        }
    }
}
