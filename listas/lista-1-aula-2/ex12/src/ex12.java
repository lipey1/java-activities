// Implemente um programa que leia 5 números inteiros do usuário, armazene-os em um array e os imprima em ordem crescente.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        System.out.println("Insira 5 numeros: ");
        int n1,n2,n3,n4,n5;
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
        n4 = scan.nextInt();
        n5 = scan.nextInt();
        System.out.println("Em ordem crescente fica assim:");
        int[] teste = {n1,n2,n3,n4,n5};
        for (int i = 0; i < teste.length; i++) {
            Arrays.sort(teste);
            System.out.println(teste[i]);
        }
    }
}
