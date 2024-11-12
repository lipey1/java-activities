import java.util.Scanner;

public class Main {
    public static int soma(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        System.out.println("Insira um numero: ");
        n1 = scan.nextInt();
        System.out.println("Insira mais um numero: ");
        n2 = scan.nextInt();
        System.out.println(Main.soma(n1, n2));
    }
}