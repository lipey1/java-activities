import java.util.ArrayList;
import java.util.List;

public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String cep;

    public Endereco(String cep, String cidade, String numero, String rua) {
        this.cep = cep;
        this.cidade = cidade;
        this.numero = numero;
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
