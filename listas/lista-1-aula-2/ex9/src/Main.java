import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("O que deseja fazer ?");
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        Scanner scan = new Scanner(System.in);
        int escolha =  0;
        escolha = scan.nextInt();
        switch (escolha){
            case 1:
                soma();
                break;
            case 2:
                subtracao();
                break;
            case 3:
                multiplicacao();
                break;
            case 4:
                divisao();
                break;
            default:
                System.out.println("Numero inválido!");
        }
    }
    public static void soma(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        float n1 = scan.nextFloat();
        System.out.println("Insira o segundo numero: ");
        float n2 = scan.nextFloat();
        System.out.println(n1 + n2);
    }public static void subtracao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        float n1 = scan.nextFloat();
        System.out.println("Insira o segundo numero: ");
        float n2 = scan.nextFloat();
        System.out.println(n1 - n2);
    }public static void multiplicacao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        float n1 = scan.nextFloat();
        System.out.println("Insira o segundo numero: ");
        float n2 = scan.nextFloat();
        System.out.println(n1 * n2);
    }public static void divisao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        float n1 = scan.nextFloat();
        System.out.println("Insira o segundo numero: ");
        float n2 = scan.nextFloat();
        System.out.println(n1 / n2);
    }
}