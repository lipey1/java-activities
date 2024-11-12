public class Endereco {
    private String cep;
    private String uf;
    private String endereco;

    public Endereco(String cep, String endereco, String uf) {
        this.cep = cep;
        this.endereco = endereco;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco:" +
                "cep:'" + cep + '\'' +
                ", uf:'" + uf + '\'' +
                ", endereco:'" + endereco + '\'' +
                '.';
    }
}
