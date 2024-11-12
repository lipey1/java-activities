import java.util.ArrayList;
import java.util.List;

public class Autor {

    private String nome;
    private String nacionalidade;
    private List<Livro> livros;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        livros = new ArrayList<>();
    }

    public List<Livro> escreverLivro(Livro livro) {
        livros.add(livro);
        return livros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "livros=" + livros +
                ", \nnome='" + nome + '\'' +
                ", \nnacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}