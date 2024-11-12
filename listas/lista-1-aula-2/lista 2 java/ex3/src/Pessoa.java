public class Pessoa {
    String nome;
    int idade;
    int altura;

    public Pessoa(String nome, int idade, int altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentacao(String nome, int idade, int altura){
        System.out.println("\nOlá! Eu me chamo " + nome + ", tenho "+ idade + " anos, e " + altura + "cm de altura.\n");
    }
}
