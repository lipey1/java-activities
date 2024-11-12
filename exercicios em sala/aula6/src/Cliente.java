public class Cliente {
    private String nome;
    private Endereco enderecoAtual;

    public Cliente(Endereco enderecoAtual, String nome) {
        this.enderecoAtual = enderecoAtual;
        this.nome = nome;
    }

    public Endereco getEnderecoAtual() {
        return enderecoAtual;
    }

    public void setEnderecoAtual(Endereco enderecoAtual) {
        this.enderecoAtual = enderecoAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
