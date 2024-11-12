public class Animal {
    private String nome;
    private Integer idade;

    public Animal (String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void respirar (){
        System.out.println("Respirando...");
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idade:" + idade +
                ", nome:'" + nome + '\'' +
                '}';
    }
}
