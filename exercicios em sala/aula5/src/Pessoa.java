import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Integer idade;
    private List<Endereco> enderecos;

    public Pessoa(Integer idade, String nome) {
        this.idade = idade;
        this.nome = nome;
        this.enderecos = new ArrayList<>();
    }

    public List<Endereco> incluirEndereco(Endereco endereco) {
        enderecos.add(endereco);
        return enderecos;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "enderecos:" + enderecos +
                ", nome:'" + nome + '\'' +
                ", idade:" + idade +
                '}';
    }
}