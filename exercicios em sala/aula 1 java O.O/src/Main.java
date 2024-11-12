import java.util.Scanner;

//public class Main {
//    public static void main(String[] args)
//    {
//        System.out.println("Hello world!");
//        System.out.println("atomasuacu");
//        for (int i = 0; i < 20; i++) {
//            System.out.println("Numero: " + i);
//        }
//        System.out.println("digite uma palavra");
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//        String nome = scanner.nextLine();
//        System.out.printf("%s", nome);
//
//    }
//}
public class TesteLegal{
    public static void main(String[]args){
        TesteLegal exemplo = new TesteLegal();
        exemplo.exibirMensagem();
        exemplo.exibirMensagemPersonalizada("Bem-vindo!");
        int resultado = exemplo.somar(5,8);
        System.out.println("Resultado: " + resultado);
    }
    public void exibirMensagem(){
        System.out.println("Olá, mundo!");
    }
    public void exibirMensagemPersonalizada(String mensagem){
        System.out.println(mensagem);
    }
    public int somar(int a, int b){
        return a + b;
    }
}