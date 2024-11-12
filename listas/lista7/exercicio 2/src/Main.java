import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Crie um programa que use um `Set` para armazenar uma lista de palavras únicas inseridas pelo usuário.
// Ao final, mostre todas as palavras sem duplicatas.
public class Main {
    public static void main(String[] args) {
        Set<String> wordList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            String word = sc.nextLine();
            wordList.add(word);
        }

    }
}