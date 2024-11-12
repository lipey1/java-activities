import org.w3c.dom.ls.LSOutput;

public class CadastroPessoa {
    public static void main(String[] args) {

    Pessoa pessoa = new Pessoa(51, "Marcos");
    Endereco endereco = new Endereco("321312-32", "Rua Carlinhos Gomes", "PR");


        System.out.println(pessoa);
        System.out.println(pessoa.incluirEndereco(endereco));



    }


}
