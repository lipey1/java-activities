// Desenvolva um programa que converta temperaturas entre Celsius e Fahrenheit. O usuário deve escolher qual conversão deseja realizar e inserir o valor da temperatura a ser convertida.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner scan = new Scanner(System.in);
        System.out.println("O que deseja fazer ?");
        System.out.println("1 - Fahrenheit para Celsius\n2 - Celsius para Fahrenheit");
        escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                FahrenheitToCelsius();
                break;
            case 2:
                CelsiusToFahrenheit();
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }
    }

    public static void FahrenheitToCelsius() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma temperatura em Fahrenheit:");
        double temp = scan.nextDouble();
        double result = (temp - 32) * 5 / 9;
        String results = String.format("%.1f", result);

        System.out.println("A temperatura em Celsius é: " + results + "º");
    }

    public static void CelsiusToFahrenheit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma temperatura em Celsius:");
        double temp = scan.nextDouble();
        double result = (temp * 1.8) + 32;
        String results = String.format("%.1f", result);
        System.out.println("A temperatura em Fahrenheit é: " + results + "º");
    }

}