// Crie um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Utilize tanto a versão iterativa quanto a versão recursiva.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira um numero:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Versão recursiva:");
        System.out.println(fatorialRecursivo(num, 1));
        System.out.println("Versão iterativa:");
        for (int i = num; i > 1; i--) {
            num *= i - 1;
        }
        System.out.println(num);
    }
    public static int fatorialRecursivo (int numero, int value){
        if(numero == 0) {
            return value;
        } else return fatorialRecursivo(numero - 1, value * numero);
    }
}
